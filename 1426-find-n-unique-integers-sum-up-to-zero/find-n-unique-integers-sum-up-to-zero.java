class Solution {
    public int[] sumZero(int n) {
        int []ans = new int[n];
        int len = (n % 2) == 0 ? n : n-1;
        int x = 1;
        for(int i=0;i<len;i+=2){
            ans[i] = x;
            ans[i+1] = -x;
            x++;
        }
        return ans;
    }
}