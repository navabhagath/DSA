class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0;i<n;i++){
            List<Integer>al = new ArrayList<>();
            int r=i,c=0;
            while(r<n && c<m){
                al.add(mat[r++][c++]);
            }
            Collections.sort(al);
            r=i;
            c=0;
            for(int num : al){
                mat[r++][c++] = num;
            }
        }
        for(int i=1;i<m;i++){
            List<Integer>al = new ArrayList<>();
            int r=0,c=i;
            while(r<n && c<m){
                al.add(mat[r++][c++]);
            }
            Collections.sort(al);
            r=0;
            c=i;
            for(int num : al){
                mat[r++][c++] = num;
            }
        }
        return mat;
    }
}