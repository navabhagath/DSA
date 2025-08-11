class Solution {
    public static final int MOD = 1_000_000_007;
    public int[] productQueries(int n, int[][] queries) {
        List<Integer>al = new ArrayList<>();
        for(int i=0;i<32;i++){
            if((n & (1<<i)) != 0 ){
                al.add(1<<i);
            }
        }
        int m = al.size();
        int len = queries.length;
        int []ans = new int[len];
        int idx = 0;
        for(int []q : queries){
            int l = q[0];
            int r = q[1];
            long prod = 1;
            for(int i=l;i<=r;i++){
                prod = (prod * al.get(i)) % MOD;
            }
            ans[idx++] = (int) prod;
        }
        return ans;
    }
}