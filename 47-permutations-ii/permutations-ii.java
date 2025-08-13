class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        Set<List<Integer>>hs = new HashSet<>();
        List<List<Integer>>ans = new ArrayList<>();
        permute(hs,nums,0,n-1);
        for(List<Integer>al : hs){
            ans.add(new ArrayList<>(al));
        }
        return ans;
    }
    public void permute(Set<List<Integer>>hs,int []nums,int left,int right){
        if(left == right){
            List<Integer>temp = new ArrayList<>();
            for(int num : nums){
                temp.add(num);
            }
            hs.add(temp);
            return;
        }
        for(int i=left;i<=right;i++){
            swap(nums,left,i);
            permute(hs,nums,left+1,right);
            swap(nums,left,i);
        }
    }
    public void swap(int []nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}