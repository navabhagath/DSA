class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        for(int i=0;i<n;i++){
            List<Integer>al = new ArrayList<>();
            int r=i,c=0;
            while(r<n && c<n){
                al.add(grid[r][c]);
                r++;
                c++;
            }
            Collections.sort(al,Collections.reverseOrder());
            r=i;
            c=0;
            for(int num : al){
                grid[r][c] = num;
                r++;
                c++;
            }
        }
        for(int i=1;i<n;i++){
            int r=0,c=i;
            List<Integer>al = new ArrayList<>();
            while(r<n && c<n){
                al.add(grid[r][c]);
                r++;
                c++;
            }
            Collections.sort(al);
            r=0;
            c=i;
            for(int num : al){
                grid[r][c] = num;
                r++;
                c++;
            }
        }
        return grid;
    }
}