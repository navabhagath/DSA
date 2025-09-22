class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer>mp = new HashMap<>();
        for(int num : nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int max = 0;
        for(int val : mp.values()){
            max = Math.max(max,val);
        }
        int ans = 0;
        for(int val : mp.values()){
            if(val == max){
                ans+=max;
            }
        }
        return ans;
    }
}