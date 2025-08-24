class Solution {
    public int longestOnes(int[] nums, int k) {
        int res = 0;
        int zc = 0;
        int n = nums.length;
        int i=0,j=0;
        while(j<n){
            if(nums[j] == 0){
                zc++;
            }
            while(zc > k){
                if(nums[i] == 0){
                    zc--;
                }
                i++;
            }
            res = Math.max(res,j-i+1);
            j++;
        }
        return res;
    }
}