class Solution {
    public int count(int i){
        return Integer.bitCount(i);
    }
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=count(i);
        }
        return ans;
    }
}