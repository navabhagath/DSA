class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0;
        for(int num : nums) sum+=num;
        int ans=0;
        int n=nums.length;
        long cursum=0;
        for(int i=0;i<n-1;i++){
            cursum += nums[i];
            sum-=nums[i];
            if(cursum >= sum) {
                ans++;
            }
        }
        return ans;
    }
}