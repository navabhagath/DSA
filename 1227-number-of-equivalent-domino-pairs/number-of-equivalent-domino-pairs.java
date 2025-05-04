class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int []a = new int[100];
        int ans=0;
        for(int []d : dominoes){
            int val = d[0]<d[1] ? d[0]*10+d[1] : d[1]*10+d[0];
            ans+=a[val];
            a[val]++;
        }
        return ans;
    }
}