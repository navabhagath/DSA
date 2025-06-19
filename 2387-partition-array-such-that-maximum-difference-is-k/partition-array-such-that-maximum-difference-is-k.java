class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=0;
        int temp=nums[0];
        for(int num : nums) System.out.print(num+" ");
        for(int i=1;i<nums.length;i++){
            if(nums[i]-temp > k){
                ans++;
                temp=nums[i];
            }
        }
        return ans+1;
    }
}