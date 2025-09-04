class Solution {
    public int movesToMakeZigzag(int[] nums) {
        int a = helper(nums,0);
        int b = helper(nums,1);
        return Math.min(a,b);
    }
    private int helper(int []nums, int start){
        int cnt = 0;
        int n = nums.length;
        for(int i=start;i<n;i+=2){
            int left = (i>0) ? nums[i-1] : Integer.MAX_VALUE;
            int right = (i+1 < n) ? nums[i+1] : Integer.MAX_VALUE;
            int mini = Math.min(left,right);
            if(nums[i] >= mini){
                cnt += nums[i] - (mini - 1); 
            }
        }
        return cnt;
    }    
}