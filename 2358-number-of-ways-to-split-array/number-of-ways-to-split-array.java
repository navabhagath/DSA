class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum = 0;
        for(int num : nums) sum+=num;
        int ans=0;
        int n=nums.length;
        long cursum=0;
        for(int i=0;i<n-1;i++){
            cursum += nums[i];
            System.out.println(sum +" "+ cursum);
            if(cursum >= sum-cursum) {
                ans++;
            }
        }
        return ans;
    }
}