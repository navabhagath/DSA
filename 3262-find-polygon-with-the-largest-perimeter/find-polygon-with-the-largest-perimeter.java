class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long []pre = new long[n];
        pre[0] = nums[0];
        for(int i=1;i<n;i++){
            pre[i] = nums[i] + pre[i-1];
        }
        if(n<3){
            return -1;
        }
        long ans =-1;
        for(int i=2;i<n;i++){
            if(pre[i-1] > nums[i]){
                ans = Math.max(ans , pre[i]);
            }
        }
        return ans;
    }
}