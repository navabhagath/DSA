class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int left=(i-1+n)%n;
            int right=(i+1)%n;
            if(colors[i]!=colors[left] && colors[i]!=colors[right]){
                ans++;
            }
        }
        return ans;
    }
}