class Solution {
    public static int findP(int []dsuf,int a){
        if(dsuf[a] == -1){
            return a;
        }
        return dsuf[a] = findP(dsuf,dsuf[a]);
    } 
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int []dsuf = new int[26];
        Arrays.fill(dsuf,-1);
        int n = s1.length();
        for(int i=0;i<n;i++){
            char u = s1.charAt(i);
            char v = s2.charAt(i);
            if(u==v) continue;
            int px = findP(dsuf,u-'a');
            int py = findP(dsuf,v-'a');
            if(px == py) continue;
            if(px>py) dsuf[px]=py;
            else dsuf[py]=px;
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<baseStr.length();i++){
            char ch = baseStr.charAt(i);
            int par = findP(dsuf,ch-'a');
            ans.append((char)(par+97));
        }
        return ans.toString();
    }
}