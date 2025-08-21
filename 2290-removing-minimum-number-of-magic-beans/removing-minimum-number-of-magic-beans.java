class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        long ans = Long.MAX_VALUE;
        long sum = 0;
        long n = beans.length;
        for(int num : beans) sum+=num;
        for(int i=0;i<beans.length;i++,n--){
            ans = Math.min(ans , sum - beans[i]*(n) );
        }
        return ans;
    }
}