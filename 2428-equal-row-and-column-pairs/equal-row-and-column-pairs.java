class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int p=31;
        List<String>row=new ArrayList<>();
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(grid[i][j]+"");
                if(j<n-1){
                    sb.append("-");
                }
            }
            row.add(sb.toString());
        }
        List<String>col=new ArrayList<>();
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(grid[j][i]+"");
                if(j<n-1){
                    sb.append("-");
                }
            }
            col.add(sb.toString());
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(row.get(i).equals(col.get(j))){
                    ans++;
                }
            }
        }
        return ans;
        
    }
}