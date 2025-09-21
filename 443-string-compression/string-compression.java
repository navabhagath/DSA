class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        String str = new String(chars);
        StringBuilder sb = new StringBuilder();
        int i=0,j=0;
        int cnt = 0;
        while(j<n){
            char ch = str.charAt(j);
            if(ch == str.charAt(i)){
                cnt++;
                j++;
            }else{
                if(cnt==1){
                    sb.append(str.charAt(i));
                }else{
                    sb.append(str.charAt(i)).append(cnt);
                }
                cnt = 0;
                i=j;
            }
        }
        if(cnt==1){
            sb.append(str.charAt(i));
        }else{
            sb.append(str.charAt(i)).append(cnt);
        }
        String temp = sb.toString();
        for(int k=0;k<temp.length();k++){
            chars[k] = sb.charAt(k);
        }
        return sb.length();
    }
}