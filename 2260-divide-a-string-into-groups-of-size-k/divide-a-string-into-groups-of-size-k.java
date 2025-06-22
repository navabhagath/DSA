class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int size = (n+k-1)/k;
        
        String []arr = new String[size];
        for(int i=0;i<size;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<k;j++){
                int idx = i*k+j;
                if(idx<n){
                    sb.append(s.charAt(idx));
                }else{
                    sb.append(fill);
                }
            }
            arr[i] = sb.toString();
        }
        return arr;
    }
}