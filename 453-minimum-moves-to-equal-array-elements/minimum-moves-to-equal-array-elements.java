class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int min = nums[0];
        int ans = 0;
        for(int i=0;i<n;i++){
            ans +=(nums[i] - min);
        }
        return ans;
    }
}