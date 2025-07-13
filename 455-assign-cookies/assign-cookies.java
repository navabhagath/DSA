class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans=0,p1=0,p2=0;
        int n = g.length;
        int m = s.length;
        while(p1<n && p2<m){
            if(s[p2] >= g[p1]){
                ans++;
                p1++;
                p2++;
            }else if(s[p2] < g[p1]){
                p2++;
            }
        }
        return ans;
    }
}