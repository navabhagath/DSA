class Solution {
    public String greatestLetter(String s) {
        List<String>al = new ArrayList<>();
        for(char ch : s.toCharArray()){
            String str = Character.toUpperCase(ch)+"";
            if(Character.isUpperCase(ch)){
                String chh = Character.toLowerCase(ch) +"";
                if(s.contains(chh)){
                    al.add(str);
                }
            }
        }
        Collections.sort(al);
        if(al.size() == 0){
            return "";
        }
        return al.get(al.size()-1);
    }
}