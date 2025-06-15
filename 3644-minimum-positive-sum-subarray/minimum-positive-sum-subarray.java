class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int ans = Integer.MAX_VALUE;
        boolean found = false;
        for(int i=l;i<=r;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=nums.get(j);
                if(j>=i-1){
                    if(sum>0){
                        ans=Math.min(ans,sum);
                        found=true;
                    }
                    sum-=nums.get(j-i+1);
                }
            }
        }
        return found ? ans : -1;
        
    }
}