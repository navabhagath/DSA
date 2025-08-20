class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int [][]dp = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i] , -1);
        }
        int ans = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 1){
                    ans+= solve(i,j,matrix,dp);
                }
            }
        }
        return ans;
    }
    public int solve(int i,int j,int [][]mat,int [][]dp){
        int m = mat.length;
        int n = mat[0].length;
        if(i>=m || j>=n || mat[i][j] == 0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int right = solve(i,j+1,mat,dp);
        int diag = solve(i+1,j+1,mat,dp);
        int bottom = solve(i+1,j,mat,dp);

        return dp[i][j] = 1+Math.min(right,Math.min(diag,bottom));
    }
}