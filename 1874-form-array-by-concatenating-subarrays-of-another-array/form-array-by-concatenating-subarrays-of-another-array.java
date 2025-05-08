class Solution {
    public boolean canChoose(int[][] groups, int[] nums) {
        int currentPos = 0;
        for (int[] group : groups) {
            currentPos = findGroupInNums(group, nums, currentPos);
            if (currentPos == -1) {
                return false;
            }
            currentPos += group.length;
        }
        return true;
    }
    
    private int findGroupInNums(int[] group, int[] nums, int start) {
        for (int i = start; i <= nums.length - group.length; i++) {
            boolean match = true;
            for (int j = 0; j < group.length; j++) {
                if (nums[i + j] != group[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return i;
            }
        }
        return -1;
    }
}