class Solution {
    public int maxSum(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int n = nums.length;
        List<Integer>al = new ArrayList<>();
        for(int x : nums){
            if(!al.contains(x) && x>=0){
                al.add(x);
            }
        }
        int maxi = Arrays.stream(nums).max().getAsInt();
        if(al.size() == 0){
            return maxi;
        }
        int max = Collections.max(al);
        int len = al.size();
        int []pre = new int[len];
        pre[0] = al.get(0);
        for(int i=1;i<len;i++){
            pre[i] = pre[i-1] + al.get(i);
        }
        int max2 = Arrays.stream(pre).max().getAsInt();
        if(max2 > max) {
            return max2;
        }

        return max;
    }
}