class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            ans = Math.min(ans,nums[i+1]-nums[i]);
        }
        return ans;
    }
}