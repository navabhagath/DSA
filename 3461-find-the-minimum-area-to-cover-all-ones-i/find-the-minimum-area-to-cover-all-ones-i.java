class Solution {
    public int minimumArea(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int minR = m+1, maxR = -1;
        int minC = n+1 , maxC = -1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    minR = Math.min(minR , i+1);
                    maxR = Math.max(maxR , i+1);
                    minC = Math.min(minC , j+1);
                    maxC = Math.max(maxC , j+1);
                }
            }
        }
        int l = maxR - minR + 1;
        int b = maxC - minC + 1;
        System.out.println(l +" "+ b);
        return l * b;
    }
}