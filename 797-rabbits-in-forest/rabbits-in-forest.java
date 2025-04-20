class Solution {
    public int numRabbits(int[] answers) {
        int n=answers.length;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int num : answers){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer>mpp : mp.entrySet()){
            ans+= Math.ceil((double)mpp.getValue()/(mpp.getKey()+1))*(mpp.getKey()+1);
        }
        return ans;
    }
}