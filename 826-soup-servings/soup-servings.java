class Solution{
    public double help(int n, int m, double[][] dp) {
        if (n <= 0 && m <= 0) return 0.5;
        if (n <= 0) return 1.0;
        if (m <= 0) return 0.0;
        if (dp[n][m] != -1) return dp[n][m];

        double ans = 0;
        ans += help(n - 4, m, dp);
        ans += help(n - 3, m - 1, dp);
        ans += help(n - 2, m - 2, dp);
        ans += help(n - 1, m - 3, dp);

        dp[n][m] = ans * 0.25; 
        return dp[n][m];
    }

    public double soupServings(int n) {
        if (n > 5000) return 1.0; 
        int val = (int) Math.ceil(n / 25.0);

        double[][] dp = new double[val + 1][val + 1];
        for (double[] row : dp) {
            Arrays.fill(row, -1);
        }

        return help(val, val, dp);
    }
}