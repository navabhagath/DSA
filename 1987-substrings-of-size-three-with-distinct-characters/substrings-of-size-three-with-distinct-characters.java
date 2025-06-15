class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int ans=0;
        int j=0;
        Map<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            if(i>=2){
                if(mp.size()==3){
                    ans++;
                }
                char del = s.charAt(j);
                mp.put(del,mp.get(del)-1);
                if(mp.get(del)==0){
                    mp.remove(del);
                }
                j++;
            }
        }
        return ans;
    }
}