class Solution {
    public long countSubarrays(int[] nums, long k) {
        long cnt=0,sum=0;
        int i=0,j=0;
        int n=nums.length;
        while(j<n){
            sum+=nums[j];
            while( (sum*(j-i+1))>=k ){
                sum-=nums[i];
                i++;
            }
            cnt+= j-i+1;
            j++;
        }
        return cnt;
    }
}