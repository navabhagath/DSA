class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=0;
        for(int num : nums){
            if(num<k){
                ans++;
            }else{
                break;
            }
        }
        return ans;
    }
}