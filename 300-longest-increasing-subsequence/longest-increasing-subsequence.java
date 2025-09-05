class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int [][]dp = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i] , -1);
        }
        return helper(0,-1,nums,dp);
    }
    private int helper(int idx,int prev,int []nums,int [][]dp){
        if(idx == nums.length){
            return 0;
        }
        if(dp[idx][prev+1] != -1){
            return dp[idx][prev+1];
        }
        int skip = helper(idx+1,prev,nums,dp);
        int take = 0;
        if(prev == -1 || nums[idx] > nums[prev]){
            take = 1 + helper(idx+1,idx,nums,dp);
        }
        int len = Math.max(skip,take);
        return dp[idx][prev+1] = len;
    }
}