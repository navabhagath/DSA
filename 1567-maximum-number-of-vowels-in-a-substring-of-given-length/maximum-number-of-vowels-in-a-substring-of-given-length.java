class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0;
        int n = s.length();
        int vcnt = 0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                vcnt++;
            }
        }
        ans = Math.max(ans,vcnt);
        for(int i=k;i<n;i++){
            if(isVowel(s.charAt(i-k))){
                vcnt--;
            }
            if(isVowel(s.charAt(i))){
                vcnt++;
            }
            ans = Math.max(ans,vcnt);
        }
        ans = Math.max(ans,vcnt);
        return ans;
    }
    public boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}