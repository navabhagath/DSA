class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        TreeSet<Integer>ans = new TreeSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[j] == key && Math.abs(i-j) <= k){
                    ans.add(i);
                }
            }
        }
        List<Integer>res = new ArrayList<>();
        for(int num : ans) res.add(num);
        return res;
    }
}