class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        if(n<=2) return s;
        String temp = s.substring(0,2);
        StringBuilder sb = new StringBuilder(temp);
        for(int i=2;i<n;i++){
            char ch = s.charAt(i);
            if(ch == sb.charAt(sb.length()-1) && ch == sb.charAt(sb.length()-2)){
                continue;
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}