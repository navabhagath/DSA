class Solution {
    public String greatestLetter(String s) {
        String ans = "";
        for(char ch : s.toCharArray()){
            String str = Character.toUpperCase(ch)+"";
            if(Character.isUpperCase(ch)){
                String chh = Character.toLowerCase(ch) +"";
                if(s.contains(chh)){
                    if(str.compareTo(ans) > 0){
                        ans = str;
                    }
                }
            }
        }
        return ans;
    }
}