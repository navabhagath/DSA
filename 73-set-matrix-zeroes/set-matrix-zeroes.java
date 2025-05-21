class Solution {
    public void setZeroes(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        boolean []row = new boolean[m];
        boolean []col = new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i] || col[j]){
                    mat[i][j]=0;
                }
            }
        }
    }
}