class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int i=0,j=n-1;
        int left=0,right=0;
        int ans=0;
        while(i<j){
            if(height[i] <= height[j]){
                left = Math.max(left,height[i]);
                ans+= left-height[i];
                i++;
            }else{
                right = Math.max(right,height[j]);
                ans+= right - height[j];
                j--;
            }
        }
        return ans;
    }
}