class Solution {
    public int totalFruit(int[] nums) {
        Map<Integer,Integer>mp = new HashMap<>();
        int i=0;
        int j=0;
        int res = 0;
        while(j<nums.length){
            mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
            while(mp.size() > 2){
                mp.put(nums[i] , mp.get(nums[i]) - 1);
                if(mp.get(nums[i]) == 0){
                    mp.remove(nums[i]);
                }
                i++;
            }
            res = Math.max(res,j-i+1);
            j++;
        }
        
        return res;
    }
}