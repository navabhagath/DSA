class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        ArrayList<Integer>al = new ArrayList<>();
        Set<Integer>hs = new HashSet<>();
        int n = nums.length;
        int i=0,j=0;
        int sum = 0;
        while(j<n){
            while(hs.contains(nums[j])){
                hs.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
            sum+=nums[j];
            al.add(sum);
            hs.add(nums[j]);
            j++;
        }
        return Collections.max(al);
    }
}