class Solution {
    public int distinctAverages(int[] nums) {
        Set<Double>hs = new HashSet<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int n = nums.length;
        for(int i=0;i<n/2;i++){
            int a = nums[i];
            int b = nums[n-i-1];
            double avg = (a+b)/2.0;
            hs.add(avg);
            System.out.println(a+" "+ b+" " + avg);
        }
        return hs.size();
    }
}