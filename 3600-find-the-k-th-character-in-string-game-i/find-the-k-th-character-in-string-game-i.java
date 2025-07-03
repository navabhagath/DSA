class Solution {
    public char kthCharacter(int k) {
        
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        while(sb.length() < 500){
            StringBuilder temp = new StringBuilder();
            for(int i=0;i<sb.length();i++){
                char c = sb.charAt(i);
                temp.append( (char)  (((c-'a'+1)%26) + 'a')      );
            }
            sb.append(temp);
        }
        System.out.println(sb.toString());
        return sb.charAt(k-1);
    }
}