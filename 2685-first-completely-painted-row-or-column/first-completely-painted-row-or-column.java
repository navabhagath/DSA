class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        Map<Integer,int[]>mp = new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mp.put(mat[i][j] , new int[]{i,j});
            }
        }
        int len = arr.length;
        int []row = new int[m];
        int []col = new int[n];

        for(int i=0;i<len;i++){
            int []idx = mp.get(arr[i]);
            int r = idx[0];
            int c = idx[1];
            row[r]++;
            if(row[r] == n) return i;
            col[c]++;
            if(col[c] == m) return i;
        }
        return 0;

    }
    private boolean valid(int row,int col,boolean [][]temp){
        int m = temp.length;
        int n = temp[0].length;
        boolean fullRow = true;
        for(int i=0;i<n;i++){
            if(!temp[row][i]){
                fullRow = false;
                break;
            }
        }
        boolean fullCol = true;
        for(int i=0;i<m;i++){
            if(!temp[i][col]){
                fullCol = false;
                break;
            }
        }
        return fullRow || fullCol;
    }
    public int[] helper(int[][]mat , int num){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == num){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }
}