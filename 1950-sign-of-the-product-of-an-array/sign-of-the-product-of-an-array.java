class Solution {
    public static final int mod = 1_000_000_007;
    public int arraySign(int[] nums) {
        long  prod = 1;
        for(int num : nums) {
            prod =( prod * num ) % mod ;
        }

        if(prod == 0) return 0;
        else if(prod >0 ) return 1;
        return -1;
    }
}