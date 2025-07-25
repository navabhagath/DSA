class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1' && !vis[i][j]){
                    helper(grid,vis,i,j);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public void helper(char [][]grid,boolean[][] vis,int i,int j){
        int n = grid.length;
        int m = grid[0].length;
        if(i<0 || j<0 || i>=n || j>=m || vis[i][j] || grid[i][j] == '0') return;
        vis[i][j] = true;
        helper(grid,vis,i-1,j);
        helper(grid,vis,i+1,j);
        helper(grid,vis,i,j-1);
        helper(grid,vis,i,j+1);
    }
}