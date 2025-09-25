class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int n = t.size();
        int [][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE); // sentinel
        }
        return solve(0, 0, t, dp);
    }

    private int solve(int i, int j, List<List<Integer>> t, int[][] dp) {
        int n = t.size();
        if (i == n - 1) {
            return dp[i][j] = t.get(i).get(j);
        }
        if (dp[i][j] != Integer.MAX_VALUE) return dp[i][j];

        int a = solve(i + 1, j, t, dp);
        int b = solve(i + 1, j + 1, t, dp);

        return dp[i][j] = t.get(i).get(j) + Math.min(a, b);
    }
}