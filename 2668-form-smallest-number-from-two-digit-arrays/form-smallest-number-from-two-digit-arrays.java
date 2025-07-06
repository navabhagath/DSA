class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        HashSet<Integer>hs2 = new HashSet<>();
        int min1 = Arrays.stream(nums1).min().getAsInt();
        int min2 = Arrays.stream(nums2).min().getAsInt();
        Arrays.sort(nums1);
        for(int num : nums2){
            hs2.add(num);
        }
        for(int i=0;i<nums1.length;i++){
            if(hs2.contains(nums1[i])){
                return nums1[i];
            }
        }
        if(min1 > min2){
            return min2*10 + min1;
        }
        return min1*10 + min2;
    }
}