class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
        int n = f.length;
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(f[i] <= b[j] && b[j]!=0){
                    b[j] = 0;
                    cnt++;
                    break;
                }
            }
        }
        return n - cnt;
    }
}