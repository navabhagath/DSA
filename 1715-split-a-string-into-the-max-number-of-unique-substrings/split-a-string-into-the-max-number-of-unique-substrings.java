class Solution {
    public int ans = 0;
    public int maxUniqueSplit(String s) {
        helper(s,0,new HashSet<>());
        return ans;
    }
    public void helper(String s,int start,HashSet<String>hs){
        if(start == s.length()){
            ans = Math.max(ans,hs.size());
            return;
        }
        for(int i=start+1;i<=s.length();i++){
            String str = s.substring(start,i);
            if(!hs.contains(str)){
                hs.add(str);
                helper(s,i,hs);
                hs.remove(str);
            }
        }
    }
}