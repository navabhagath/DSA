class Solution {
    public int maxDistance(String str, int k) {
        int ans=0;
        int n=0,s=0,w=0,e=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='N') n++;
            else if(c=='S') s++;
            else if(c=='W') w++;
            else e++;

            int x = Math.abs(n-s);
            int y = Math.abs(w-e);
            int dist = x+y;
            int tempdist = dist + Math.min(2*k,i+1-dist);
            ans=Math.max(ans,tempdist);
        }
        return ans;
    }
}