class Solution {
    public int findShortestSubArray(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer>left=new HashMap<>();
        Map<Integer,Integer>right=new HashMap<>();
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int num = nums[i];
            if(left.get(num) == null){
                left.put(num,i);
            }
            right.put(num,i);
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int max = Collections.max(mp.values());
        int ans=n;
        for(int x : mp.keySet()){
            if(mp.get(x) == max){
                ans = Math.min(ans,right.get(x) - left.get(x) + 1);
            }
        }
        return ans;
    }
}