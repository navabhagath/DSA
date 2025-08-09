class Solution {
    public int maxSum(int[] nums) {
        int n = nums.length;
        Map<Integer,List<Integer>> mp = new HashMap<>();
        for(int num : nums){
            int x = helper(num);
            mp.putIfAbsent(x,new ArrayList<>());
            mp.get(x).add(num);
        }
        List<Integer>keys = new ArrayList<>(mp.keySet());
        Collections.sort(keys,Collections.reverseOrder());
        int ans = -1;
        for(int key : keys){
            List<Integer>al = mp.get(key);
            Collections.sort(al);
            if(al.size() > 1){
                ans = Math.max(al.get(al.size()-1) + al.get(al.size() - 2) , ans);
            }
        }
        return ans;
    }
    private int helper(int n){
        int t = 0;
        while(n!=0){
            t = Math.max(n%10,t);
            n/=10;
        }
        return t;
    }
}