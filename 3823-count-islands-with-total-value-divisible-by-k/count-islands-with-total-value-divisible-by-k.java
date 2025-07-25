class Solution {
    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] > 0 && !vis[i][j]){
                    int x = helper(grid,vis,i,j);
                    if(x%k == 0) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static int helper(int[][] grid,boolean[][] vis,int i,int j){
        int n = grid.length;
        int m = grid[0].length;
        if(i<0 || j<0 || i>=n || j>=m || vis[i][j] || grid[i][j] == 0) return 0;
        vis[i][j] = true;
        int up = helper(grid,vis,i-1,j);
        int down = helper(grid,vis,i+1,j);
        int left = helper(grid,vis,i,j-1);
        int right = helper(grid,vis,i,j+1);
        return grid[i][j] + up + down + left + right;
    }
}