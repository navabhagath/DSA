class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int num : nums) mp.put(num,mp.getOrDefault(num,0)+1);
        int a=0,b=0;
        for(Map.Entry<Integer,Integer>en:mp.entrySet()){
            a+=en.getValue()/2;
            b+=en.getValue()%2;
        }
        return new int[]{a,b};
    }
}