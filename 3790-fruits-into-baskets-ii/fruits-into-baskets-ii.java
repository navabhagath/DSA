class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
        int n = f.length;
        int cnt = 0;
        boolean []temp = new boolean[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(f[i] <= b[j] && !temp[j]){
                    temp[j] = true;
                    cnt++;
                    break;
                }
            }
        }
        return n - cnt;
    }
}