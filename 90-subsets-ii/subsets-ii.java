class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>ds = new ArrayList<>();
        helper(0,nums,ds,ans);
        return ans;
    }
    public void helper(int idx,int []nums,List<Integer>ds,List<List<Integer>>ans){
        if(idx >= nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[idx]);
        helper(idx+1,nums,ds,ans);
        ds.remove(ds.size()-1);
        while(idx+1 < nums.length && nums[idx] == nums[idx+1]){
            idx++;
        }
        helper(idx+1,nums,ds,ans);
    }
}