class Solution {
    public char findKthBit(int n, int k) {
        String []arr = new String[20];
        arr[0] = "0";
        for(int i=1;i<20;i++){
            arr[i] = arr[i-1] + "1" + rev(invert(arr[i-1]));
        }
        System.out.println(arr[n-1]);
        return arr[n-1].charAt(k-1);
    }
    public String rev(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public String invert(String str){
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if(c=='1'){
                sb.append(0);
            }else{
                sb.append(1);
            }
        }
        return sb.toString();
    }
}