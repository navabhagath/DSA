class Solution {
    public int maxDistance(int[] colors) {
        int ans=0;
        int n = colors.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(colors[j]!=colors[i]){
                    ans = Math.max(ans,Math.abs(i-j));
                }
            }
        }
        return ans;
    }
}