class Solution {
    public int minimumChairs(String s) {
        int ans = 0;
        int ec= 0;
        for(char ch : s.toCharArray()){
            if(ch == 'E'){
                ec++;
            }else if(ch == 'L'){
                ec--;
            }
            ans = Math.max(ec,ans);
        }
        return ans;
    }
}