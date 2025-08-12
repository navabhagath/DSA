class Solution {
    public static final int mod = 1_000_000_007;
    public int numberOfWays(int n, int x) {
        
        List<Integer>al = new ArrayList<>();

        for(int i=1; ;i++){
            long pow = (int) Math.pow(i,x);
            if(pow > n) break;
            al.add( (int) pow);
        }
        int []dp = new int[n+1];
        dp[0] = 1;
        for(int p : al){
            for(int i=n;i>=p;i--){
                dp[i] = (dp[i] + dp[i-p]) % mod;
            }
        }
        return dp[n];
    }
}