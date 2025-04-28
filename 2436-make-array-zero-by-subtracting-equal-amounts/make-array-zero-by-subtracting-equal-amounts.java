class Solution {
    public int minimumOperations(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int num : nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer>en:mp.entrySet()){
            if(en.getKey()!=0) ans++;
        }
        return ans;
    }
}