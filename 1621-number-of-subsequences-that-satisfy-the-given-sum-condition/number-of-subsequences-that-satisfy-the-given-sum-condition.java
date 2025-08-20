class Solution {
    public final int mod = 1_000_000_007;
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int i=0,j=n-1;
        int ans = 0;
        int []pow = new int[n];
        pow[0] = 1;
        for(int k=1;k<n;k++){
            pow[k] = (pow[k-1] * 2)%mod;
        }
        while(i<=j){
            int sum = nums[i] + nums[j];
            if(sum <= target){
                ans =  (ans + pow[j-i]) % mod ;
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}