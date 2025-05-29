class Solution {
    public int minCostClimbingStairs(int[] c) {
        int n = c.length;
        int []dp=new int[n];
        dp[0]=c[0];
        dp[1]=c[1];
        for(int i=2;i<n;i++){
            dp[i]=c[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]); 
    }
}