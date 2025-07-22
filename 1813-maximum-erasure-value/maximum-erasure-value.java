class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        ArrayList<Integer>al = new ArrayList<>();
        Set<Integer>hs = new HashSet<>();
        int n = nums.length;
        int i=0;
        int sum = 0;
        for(int j=0;j<n;j++){
            while(hs.contains(nums[j])){
                hs.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
            sum+=nums[j];
            al.add(sum);
            hs.add(nums[j]);
        }
        return Collections.max(al);
    }
}