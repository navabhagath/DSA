class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int [][]dp = new int[n+1][amount+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i] , -1);
        }
        int ans = solve(0,coins,amount,dp);
        return ans >= (int)1e9 ? -1 : ans;
    }
    public int solve(int i,int[] coins,int amount,int [][]dp){
        if(amount == 0){
            return 0;
        }
        if(i==coins.length){
            return (int)1e9;
        }
        if(dp[i][amount] != -1){
            return dp[i][amount];
        }
        int take = (int)1e9;
        if(coins[i] <= amount){
            take =  1 + solve(i,coins,amount - coins[i],dp);
        }
        int skip = solve(i+1,coins,amount,dp);
        dp[i][amount] =  Math.min(take,skip);
        return dp[i][amount];
    }
} 