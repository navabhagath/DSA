class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int number = n+m-1;
        List<List<Integer>>diags = new ArrayList<>();
        for(int i=0;i<number;i++){
            diags.add(i,new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                diags.get(i+j).add(mat[i][j]);
            }
        }
        for(List<Integer>x : diags){
            System.out.println(x);
        }
        int idx=0;
        int[]ans = new int[n*m];
        for(int i=0;i<number;i++){
            if(i%2==0){
                Collections.reverse(diags.get(i));
            }
            for(int val : diags.get(i)){
                ans[idx++] = val;
            }
        }
        return ans;
    }
}