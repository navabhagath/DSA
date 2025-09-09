class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Map<Character,Integer>mp1 = new HashMap<>();
        // for(char c : pattern.toCharArray()){
        //     mp1.put(c,mp1.getOrDefault(c,0)+1);
        // }
        // String[] parts = s.split("\\s+");
        // Map<String,Integer>mp2 = new HashMap<>();
        // for(String str : parts){
        //     mp2.put(str,mp2.getOrDefault(str,0)+1);
        // }
        // List<Integer>al1 = new ArrayList<>(mp1.values());
        // List<Integer>al2 = new ArrayList<>(mp2.values());
        // Collections.sort(al1);
        // Collections.sort(al2);
        // return al1.equals(al2);
        String []parts = s.split(" ");
        if(pattern.length() != parts.length) return false;
        Map<Character,String>mp1 = new HashMap<>();
        Map<String,Character>mp2 = new HashMap<>();
        for(int i=0;i<parts.length;i++){
            char c = pattern.charAt(i);
            String word = parts[i];
            if(mp1.containsKey(c) && !mp1.get(c).equals(word)) return false;
            if(mp2.containsKey(word) && mp2.get(word) != c) return false;

            mp1.put(c,word);
            mp2.put(word,c);
        }
        return true;
    }
}