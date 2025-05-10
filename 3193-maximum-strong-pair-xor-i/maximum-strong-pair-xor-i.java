class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int xor=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int x = nums[i];
                int y=nums[j];
                if(Math.abs(x-y) <= Math.min(x,y)){
                    xor = Math.max(xor,x^y);
                }
            }
        }
        return xor;
    }
}