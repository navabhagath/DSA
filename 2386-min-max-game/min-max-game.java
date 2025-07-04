class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int n = nums.length;   
        int []temp = new int[n/2];
        for(int j=0;j<n/2;j++){
            temp[j] = j%2==0 ? Math.min(nums[2*j],nums[2*j+1]) : Math.max(nums[2*j],nums[2*j+1]);
        }
        return minMaxGame(temp);
    }
}