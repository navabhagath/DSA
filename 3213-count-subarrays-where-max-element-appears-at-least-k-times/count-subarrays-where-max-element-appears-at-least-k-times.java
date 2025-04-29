class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxi = Arrays.stream(nums).max().getAsInt();
        int i=0,j=0;
        long ans=0;
        int max=0;
        while(j<nums.length){
            if(nums[j]==maxi) max++;
            while(max>=k){
                if(nums[i]==maxi) max--;
                i++;
            }
            ans+=i;
            j++;
        }
        return ans;
    }
}