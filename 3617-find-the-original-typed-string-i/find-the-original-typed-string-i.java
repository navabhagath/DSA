class Solution {
    public int possibleStringCount(String word) {
        int ans=0;
        int n =word.length();
        for(int i=0;i<n;){
            int len=0;
            char ch = word.charAt(i);
            int j=i;
            while( j<n && word.charAt(j) == ch){
                len++;
                j++;
            }
            if(len > 1){
                ans+=len-1;
            }
            i=j;
        }
        return ans+1;
    }
}