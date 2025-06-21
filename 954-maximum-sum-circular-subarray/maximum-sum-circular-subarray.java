class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int sum=0;
        int maxs=0;
        int mins=0;
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            maxs+=nums[i];
            max_sum = Math.max(max_sum,maxs);
            if(maxs < 0){
                maxs=0;
            }
            mins+=nums[i];
            min_sum = Math.min(min_sum,mins);
            if(mins>0){
                mins=0;
            }
        }
        if(sum == min_sum){
            return max_sum;
        }
        return Math.max(max_sum,sum-min_sum);
    }
}