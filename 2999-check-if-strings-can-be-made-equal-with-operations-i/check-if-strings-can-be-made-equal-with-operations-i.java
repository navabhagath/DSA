class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] ch=s1.toCharArray();
        for(int i=0;i<2;i++){
            if(ch[i]==s2.charAt(i+2)){
                char c=ch[i];
                ch[i]=ch[i+2];
                ch[i+2]=c;
            }
        }
        if(String.valueOf(ch).equals(s2)) return true;

        return false;
    }
}