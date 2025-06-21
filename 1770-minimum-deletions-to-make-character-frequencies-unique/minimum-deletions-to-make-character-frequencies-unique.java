class Solution {
    public int minDeletions(String s) {
        int []frq = new int[26];
        for(char c : s.toCharArray()){
            frq[c-'a']++;
        }
        int ans=0;
        Set<Integer>hs=new HashSet<>();
        for(int i=0;i<26;i++){
            while(hs.contains(frq[i]) && frq[i]!=0){
                frq[i]--;
                ans++;
            }
            hs.add(frq[i]);
        }
        return ans;

    }
}