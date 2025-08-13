class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        List<List<Integer>>ans = new ArrayList<>();
        permute(ans,nums,0,n-1);
        return ans;
    }
    public void permute(List<List<Integer>>ans,int []nums,int left,int right){
        if(left == right){
            List<Integer>temp = new ArrayList<>();
            for(int num : nums){
                temp.add(num);
            }
            if(!ans.contains(temp)){
                ans.add(temp);
            }
            return;
        }
        for(int i=left;i<=right;i++){
            swap(nums,left,i);
            permute(ans,nums,left+1,right);
            swap(nums,left,i);
        }
    }
    public void swap(int []nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}