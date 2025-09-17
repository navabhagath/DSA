class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int []dp = new int[amount+1];
        dp[0] = 1;
        for(int num : coins){
            for(int i=1;i<=amount;i++){
                if(i - num >= 0){
                    dp[i] = dp[i] + dp[i-num];
                }
            }
        }
        return dp[amount];
    }
}