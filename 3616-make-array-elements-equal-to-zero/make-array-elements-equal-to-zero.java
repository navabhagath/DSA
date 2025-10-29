class Solution {
    public int countValidSelections(int[] nums) {
        int right = 0;
        for(int num : nums){
            right+=num;
        }
        int left = 0;
        int ans = 0;
        for(int num : nums){
            left += num;
            right -= num;
            if(num == 0 && left == right){
                ans+=2;
            }
            if(num == 0 && Math.abs(left - right) == 1){
                ans+=1;
            }
        }
        return ans;
    }
}