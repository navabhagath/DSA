class Solution {
    public int longestSubarray(int[] nums) {
        int res = 0;
        int zc = 0;
        int n = nums.length;
        int i=0,j=0;
        while(j<n){
            if(nums[j] == 0){
                zc++;
            }
            while(zc>1){
                if(nums[i] == 0){
                    zc--;
                }
                i++;
            }
            res = Math.max(res,j-i);
            j++;
        }
        return res;
    }
}