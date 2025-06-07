class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int cur=1;
            for(int j=i+1;j<n;j++){
                if(nums[j]>nums[j-1]){
                    cur++;
                }else {
                    break;
                }
            }
            ans=Math.max(ans,cur);
        }
        for(int i=0;i<n;i++){
            int cur=1;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[j-1]){
                    cur++;
                }else{
                    break;
                }
            }
            ans=Math.max(ans,cur);
        }
        return ans;
    }
}