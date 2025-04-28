class Solution {
    public int minimumOperations(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int num : nums){
            if(num==0) continue;
            else mp.put(num,mp.getOrDefault(num,0)+1);
        }
        return mp.size();
    }
}