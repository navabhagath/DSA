class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int p1=0,p2=0;
        int n = name.length();
        int m = typed.length();
        while(p1<n && p2<m){
            if(name.charAt(p1) != typed.charAt(p2)){
                return false;
            }
            int cnt1=0;
            char curr1 = name.charAt(p1);
            while(p1<n && name.charAt(p1)==curr1){
                p1++;
                cnt1++;
            }
            int cnt2=0;
            char curr2 = typed.charAt(p2);
            while(p2<m && typed.charAt(p2) == curr2){
                p2++;
                cnt2++;
            }
            if(cnt2 < cnt1){
                return false;
            }
        }
        return p1==n && p2==m;
    }
}