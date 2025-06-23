class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n==1) return 1;
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        int a=0,b=0;
        for(int i=0;i<n;i++){
            if(nums[i] == min){
                a=i;
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i] == max){
                b=i;
                break;
            }
        }
        int left = Math.min(a,b);
        int right = Math.max(a,b);

        int x = right+1;
        int y = n-left;
        int z = (left+1) + (n-right);

        return Math.min(x,Math.min(y,z));
    }
}