class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        if(s.length() % 2 == 0){
            for(int i=0;i<sb.length();i+=2){
                char a = sb.charAt(i);
                String b = sb.charAt(i+1)+"";
                int x = Integer.parseInt(b);
                sb.setCharAt(i+1, (char) (((a-'a'+x)%26)+'a'));
            }
        }else{
            for(int i=0;i<sb.length()-1;i+=2){
                char a = sb.charAt(i);
                String b = sb.charAt(i+1)+"";
                int x = Integer.parseInt(b);
                sb.setCharAt(i+1, (char) (((a-'a'+x)%26)+'a'));
            }
        }
        
        return sb.toString();
    }
}