class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            String bin = Integer.toString(n,i);
            if(!helper(bin)){
                return false;
            }
        }
        return true;
    }
    public boolean helper(String str){
        int n = str.length();
        int i=0;
        int j=n-1;
        while(i < j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}