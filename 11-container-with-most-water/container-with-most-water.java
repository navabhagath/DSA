class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i=0;
        int j=n-1;
        int ans = 0;
        while(i<j){
            int area = Math.min(height[i],height[j]) * (j-i);
            ans = Math.max(ans,area);
            if(height[i] <= height[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}