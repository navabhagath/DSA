class Solution {
    public int maximumBeauty(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int i=0,j=0,curr=0,max=0;
        while(j<n){

            while(j<n && nums[j]-nums[i] <= 2*k){
                curr++;
                j++;
            }
            max = Math.max(curr,max);
            if(j==n) break;
            while(i<=j && nums[j]-nums[i] > 2*k){
                i++;
                curr--;
            } 
        }
        return max;
    }
}