class Solution {
    public int findChampion(int[][] grid) {
        int ans = 0;
        int maxcnt = 0;
        int n = grid.length;
        for(int i=0;i<n;i++){
            int cnt = 0;
            for(int j=0;j<n;j++){
                if(i != j){
                    if(grid[i][j] == 1){
                        cnt++;
                    }
                }
            }
            if(cnt > maxcnt){
                maxcnt = cnt;
                ans=i;
            }
        }
        return ans;
    }
}