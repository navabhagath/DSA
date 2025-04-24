class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int num : nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int len=mp.size();
        int ans=0;
        for(int i=0;i<n;i++){
            Map<Integer,Integer>mp2=new HashMap<>();
            for(int j=i;j<n;j++){
                mp2.put(nums[j],mp2.getOrDefault(nums[j],0)+1);
                if(mp2.size()==len){
                    ans++;
                }
            }
        }
        return ans;
    }
}