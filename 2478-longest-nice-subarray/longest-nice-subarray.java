class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int i=0,j=0;
        int cursum=0,xor=0;
        int max=0;
        while(j<n){
            cursum+=nums[j];
            xor = xor ^ nums[j];
            while(cursum!=xor){
                cursum -= nums[i];
                xor = xor ^ nums[i];
                i++;
            }
            max = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}