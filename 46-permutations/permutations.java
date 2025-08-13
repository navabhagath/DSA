class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>>ans = new ArrayList<>();
        permute(ans,nums,0,n-1);
        return ans;
    }
    public static void permute(List<List<Integer>>ans, int[]nums,int left,int right){
        if(left == right){
            List<Integer>ds = new ArrayList<>();
            for(int num : nums){
                ds.add(num);
            }
            ans.add(ds);
            return;
        }
        for(int i=left;i<=right;i++){
            swap(nums,left,i);
            permute(ans,nums,left+1,right);
            swap(nums,left,i);
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}