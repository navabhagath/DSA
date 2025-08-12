class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int n = a.length;
        int cnt = 0;
        int []ans = new int[n];
        int []frq = new int[n+1];
        for(int i=0;i<n;i++){
            frq[a[i]]++;
            if((frq[a[i]]) == 2){
                cnt++;
            } 
            frq[b[i]]++;
            if(frq[b[i]] == 2){
                cnt++;
            }
            ans[i] = cnt;
        }
        return ans;
    }
}