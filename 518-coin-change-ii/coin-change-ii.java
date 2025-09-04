class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int [][]dp = new int[n+1][amount+1];
        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i] , -1);
        }
        return solve(0,coins,amount,dp);
    }
    public int solve(int i,int []coins,int amount,int [][]dp){
        if(amount == 0){
            return 1;
        }
        if(i == coins.length){
            return 0;
        }
        if(coins[i] > amount){
            return dp[i][amount] = solve(i+1,coins,amount,dp);
        }
        if(dp[i][amount] != -1){
            return dp[i][amount];
        }
        int take = solve(i,coins,amount-coins[i],dp);
        int skip = solve(i+1,coins,amount,dp);

        return dp[i][amount] = take + skip;
    }
}