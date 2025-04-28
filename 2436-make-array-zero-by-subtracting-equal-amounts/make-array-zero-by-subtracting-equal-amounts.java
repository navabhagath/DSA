class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer>hs = new HashSet<>();
        for(int num:nums) hs.add(num);
        return hs.contains(0)?hs.size()-1:hs.size();
    }
}