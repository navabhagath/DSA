class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        Set<List<Integer>>hs = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int k = j+1;
                int l = n-1;
                while(k < l){
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[k] + (long)nums[l];
                    if(sum == target){
                        hs.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                    }else if(sum > target){
                        l--;
                    }else{
                        k++;
                    }
                }
            }
        }
        for(List<Integer>x : hs){
            ans.add(x);
        }
        return ans;
    }
}