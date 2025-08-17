class Solution {
    public int[] twoSum(int[] nums, int target) {
        int p1=0;
        int n = nums.length;
        int p2=n-1;
        int ans1=0;
        int ans2=0;
        boolean found = false;
        while(p1<p2){
            int sum = nums[p1] + nums[p2];
            if(sum == target){
                if(!found){
                    ans1 = p1;
                    ans2 = p2;
                    found = true;
                    break;
                }
            }else if(sum < target){
                p1++;
            }else{
                p2--;
            }
        }
        return new int[]{ans1+1,ans2+1};
    }
}