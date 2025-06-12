class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        return helper(0,1,1,nums,target,nums.length);
    }
    public boolean helper(int idx,long p1,long p2,int[] nums,long target,int n){
        if(p1>target || p2>target) return false;
        if(idx==n) return p1==target && p2==target;
        return helper(idx+1,p1*nums[idx],p2,nums,target,n) | helper(idx+1,p1,p2*nums[idx],nums,target,n);
    }
}