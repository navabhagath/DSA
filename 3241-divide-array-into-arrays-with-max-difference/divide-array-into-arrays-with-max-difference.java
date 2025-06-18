class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int [][]ans=new int[n/3][3];
        Arrays.sort(nums);
        int idx=0;
        for(int i=0;i<n;i++){
            ans[idx][0] = nums[i];
            ans[idx][1] = nums[i+1];
            ans[idx][2] = nums[i+2];
            idx++;
            if((nums[i+1] - nums[i] > k ) || (nums[i+2]-nums[i] > k) || (nums[i+2]-nums[i+1] > k)){
                return new int[][]{};
            }
            i+=2;
        }
        // for(int i=0;i<n/3;i++){
        //     for(int j=0;j<n/3;j++){
        //         System.out.print(ans[i][j] +" ");
        //     }
        //     System.out.println();
        // }
        return ans;
    }
}