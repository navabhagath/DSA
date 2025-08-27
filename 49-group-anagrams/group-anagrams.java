class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> mp = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String word = strs[i];
            char []ch = word.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!mp.containsKey(sorted)){
                mp.put(sorted,new ArrayList<>());
            }
            mp.get(sorted).add(word);
        }
        return new ArrayList<>(mp.values());
    }
}