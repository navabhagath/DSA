class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        // int ans=Integer.MIN_VALUE;
        int ans=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j] > nums[i]){
                    ans=Math.max(ans,nums[j]-nums[i]);
                }
            }
        }
        // if(ans == Integer.MIN_VALUE){
        //     return -1;
        // }
        return ans;
    }
}