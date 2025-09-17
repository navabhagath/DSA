class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int [][]dp = new int[n+1][amount+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = solve(0,coins,amount,dp);
        return ans;
    }
    public int solve(int idx,int []coins,int amount,int [][]dp){
        if(amount == 0){
            return 1;
        }
        if(idx == coins.length){
            return 0;
        }
        if(dp[idx][amount] != -1){
            return dp[idx][amount];
        }
        int take = 0;
        if(coins[idx] <= amount){
            take = solve(idx,coins,amount-coins[idx],dp);
        }
        int skip = solve(idx+1,coins,amount,dp);
        return dp[idx][amount] =  take + skip;
    }
}