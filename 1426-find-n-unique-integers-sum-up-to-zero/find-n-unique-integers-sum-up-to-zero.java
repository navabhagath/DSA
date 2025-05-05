class Solution {
    public int[] sumZero(int n) {
        int []ans=new int[n];
        int l=0;
        int r=n-1;
        int x=1;
        while(l<r){
            ans[l++]=x;
            ans[r--]= -x;
            x++;
        }
        return ans;
    }
}