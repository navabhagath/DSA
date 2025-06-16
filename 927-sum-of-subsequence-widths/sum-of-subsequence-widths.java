class Solution {
    public static final int MOD = 1000000007;
    public int sumSubseqWidths(int[] nums) {
        int n = nums.length;
        long ans = 0;
        Arrays.sort(nums);
        long []pow = new long[100001];
        pow[0]=1;
        for(int i=1;i<100001;i++){
            pow[i] = (pow[i-1]*2)%MOD;
        }
        for(int i=0;i<n;i++){
            ans = (ans + (nums[i] - nums[n-i-1]) * pow[i]) % MOD ;
        }
        return (int)ans % MOD;
    }
}