class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int prod = nums[i]*nums[j];
                mp.put(prod,mp.getOrDefault(prod,0)+1);
            }
        }
        int ans=0;
        for(int val : mp.keySet()){
            int frq = mp.get(val);
            ans += 4* ((frq-1)*frq);
        }
        return ans;
    }
}