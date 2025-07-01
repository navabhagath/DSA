class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                temp.append(c);
            }
        }
        temp.reverse();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                ans.append(temp.charAt(j++));
            }else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}