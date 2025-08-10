class Solution {
    public boolean reorderedPowerOf2(int n) {
        String num = helper(n);
        for(int i=0;i<32;i++){
            String x = helper(1<<i);
            if(num.equals(x)){
                return true;
            }
        }
        return false;
    }
    public String helper(int n){
        String str = String.valueOf(n);
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        String ans = new String(arr);
        return ans;
    }
}