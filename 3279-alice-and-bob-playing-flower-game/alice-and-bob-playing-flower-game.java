class Solution {
    public long flowerGame(int n, int m) {
        long ans = 0;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         if( (i+j) %2 ==1 ){
        //             ans++;
        //         }
        //     }
        // }
        long on = (n+1)/2;
        long en = n/2;
        long om = (m+1)/2;
        long em = m/2;
        ans = on*em + en*om;
        return ans;
    }
}