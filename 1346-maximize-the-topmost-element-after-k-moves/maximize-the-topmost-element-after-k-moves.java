class Solution {
    public int maximumTop(int[] nums, int k) {
        if(nums.length == 1 && k%2!=0){
            return -1;
        }
        long n = nums.length;
        if(n <= k-1){
            int maxi = nums[0];
            for(int i=1;i<n;i++){
                maxi = Math.max(maxi,nums[i]);
            }
            return maxi;
        }
        int max = -1;
        for(int i=0;i<k-1;i++){
            max = Math.max(max,nums[i]);
        }
        if(k < n){
            max = Math.max(nums[k],max);
        }
        return max;
    }
}