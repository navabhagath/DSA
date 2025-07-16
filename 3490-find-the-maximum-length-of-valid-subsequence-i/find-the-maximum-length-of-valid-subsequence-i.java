class Solution {
    public int maximumLength(int[] nums) {
        int n = nums.length;
        int e = nums[0]%2==0?1:0;
        int o = nums[0]%2==1?1:0;
        int alternate = 1;
        boolean even = nums[0]%2==0 ? false : true;
        for(int i=1;i<n;i++){
            if((even && nums[i]%2==0) || (!even && nums[i]%2==1) ){
                alternate++;
                even = !even;
            }
            if(nums[i]%2==0) e++;
            else o++;
        }
        return Math.max(e,Math.max(o,alternate));
    }
}