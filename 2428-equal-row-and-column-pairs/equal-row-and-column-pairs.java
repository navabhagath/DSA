class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int[] row = grid[i];
            for(int j=0;j<n;j++){
                int[] col = new int[n];
                for(int k=0;k<n;k++){
                    col[k]=grid[k][j];
                }
                if(Arrays.equals(row,col)){
                    ans++;
                }
            }
        }
        return ans;
    }
}