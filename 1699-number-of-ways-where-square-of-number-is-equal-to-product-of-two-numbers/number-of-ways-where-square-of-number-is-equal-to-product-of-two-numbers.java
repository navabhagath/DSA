class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int cnt = 0;
        for(long num : nums1){
            long tar1 = num*num;
            cnt+=solve(tar1,nums2);
        }
        for(long num : nums2){
            long tar2 = num*num;
            cnt+=solve(tar2,nums1);
        }
        return cnt;
    }
    public static long solve(long tar,int[] nums){
        long cnt = 0;
        Map<Long,Long>mp = new HashMap<>();
        for(long n : nums){
            if(tar%n == 0){
                cnt+=mp.getOrDefault(tar/n,0l);
            }
            mp.put(n,mp.getOrDefault(n,0l)+1);
        }
        return cnt;
    }
}