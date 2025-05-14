class Solution {
    public int splitArray(int[] nums, int k) {
        int lo = Arrays.stream(nums).max().getAsInt();
        int hi = Arrays.stream(nums).sum();
        while(lo <= hi){
            int mid = lo+(hi-lo)/2;
            if(helper(nums,mid,k)){
                lo=mid+1;
            }else{
                hi = mid-1;
            }
        }
        return lo;
    }
    public boolean helper(int[] nums,int mid,int k){
        int cnt=1;
        int cur=0;
        for(int num : nums){
            if(cur + num <= mid){
                cur+=num;
            }else{
                cnt++;
                cur=num;
            }
        }
        return cnt>k;
    }
}