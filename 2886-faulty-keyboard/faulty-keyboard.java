class Solution {
    public String finalString(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch!='i'){
                ans.append(ch);
            }else{
                ans.reverse();
            }
        }
        return ans.toString();
    }
}