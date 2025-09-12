class Solution {
    public boolean doesAliceWin(String s) {
        int cnt = 0;
        for(char ch : s.toCharArray()){
            if(isVowel(ch)){
                cnt++;
            }
        }
        if(cnt == 0) return false;
        if(cnt % 2 != 0) return true;
        return true;
    }
    public boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}