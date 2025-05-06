class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer>al=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                al.add(matrix[i][j]);
            }
        }
        Collections.sort(al);
        return al.get(k-1);
    }
}