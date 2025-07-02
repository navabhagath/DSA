class Solution {
    public static final int MOD = 1_000_000_007;
    public int possibleStringCount(String word, int k) {
        int n = word.length();
        List<Integer>frq = new ArrayList<>();
        int cnt=1;
        for(int i=1;i<n;i++){
            if(word.charAt(i)==word.charAt(i-1)){
                cnt++;
            }else{
                frq.add(cnt);
                cnt=1;
            }
        }
        frq.add(cnt);

        long total=1;
        for(int num : frq){
            total = (total * num) % MOD;
        }
        if(frq.size() >=k ){
            return (int)total;
        }

        int []f = new int[k];
        int []g = new int[k];
        f[0] = 1;
        Arrays.fill(g,1);

        for(int i=0;i<frq.size();i++){
            int size = frq.get(i);
            int []temp1 = new int[k];
            for(int j=1;j<k;j++){
                temp1[j] = g[j-1];
                if(j-size-1  >= 0 ){
                    temp1[j] = (temp1[j] - g[j-size-1] + MOD) % MOD;
                }
            }
            int []temp2 = new int[k];
            temp2[0] = temp1[0];
            for(int j=1;j<k;j++){
                temp2[j] = (temp2[j-1] + temp1[j]) % MOD;
            }
            f = temp1;
            g = temp2;
        }

        return (int) ((total - g[k-1] + MOD) % MOD);
    }
}