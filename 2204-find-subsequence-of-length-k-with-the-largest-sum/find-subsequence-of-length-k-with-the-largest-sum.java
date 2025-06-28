class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int [][]arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr,(a,b) -> Integer.compare(b[0],a[0]));

        int [][]temp = Arrays.copyOf(arr,k);

        Arrays.sort(temp,(a,b) -> Integer.compare(a[1],b[1]));

        int []ans = new int[temp.length];
        for(int i=0;i<temp.length;i++){
            ans[i] = temp[i][0];
        }
        return ans;
    }
}