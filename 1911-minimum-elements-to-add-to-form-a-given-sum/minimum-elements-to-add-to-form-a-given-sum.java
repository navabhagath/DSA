class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for(int num : nums) sum+=num;
        long temp = Math.abs(goal - sum);
        if(temp % limit == 0){
            return (int)(temp/limit);
        }
        return (int)(temp / limit + 1);
    }
}