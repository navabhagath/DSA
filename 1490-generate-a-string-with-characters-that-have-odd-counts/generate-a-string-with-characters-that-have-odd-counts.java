class Solution {
    public String generateTheString(int n) {
        char ch1 = 'a';
        char ch2 = 'b';
        StringBuilder sb = new StringBuilder();
        if(n%2!=0){
            for(int i=0;i<n;i++){
                sb.append(ch1);
            }
        }else{
            for(int i=0;i<n-1;i++){
                sb.append(ch1);
            }
            sb.append(ch2);
        }
        return sb.toString();
    }
}