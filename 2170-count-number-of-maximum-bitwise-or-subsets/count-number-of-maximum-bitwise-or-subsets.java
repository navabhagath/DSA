class Solution {
    int cnt = 0;
    int max = 0;
    public int countMaxOrSubsets(int[] nums) {
        int n = nums.length;
        max = 0;
        for(int num : nums) max |= num;
        cnt = 0;
        solve(nums,0,max,0);
        return cnt;
    }
    public void solve(int []nums,int idx,int max,int curr){
        
        if(idx == nums.length){
            if(curr == max) cnt++;
            return;
        }

        solve(nums,idx+1,max,curr | nums[idx]);
        solve(nums,idx+1,max,curr);
    }
}