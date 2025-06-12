class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int []arr=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        arr[arr.length-1]=nums[0];
        for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.max(Math.abs(arr[i]-arr[i+1]),ans);
        }
        return ans;
    }
}