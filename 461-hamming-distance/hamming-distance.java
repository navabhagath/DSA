class Solution {
    public int hammingDistance(int x, int y) {
        String xx = Integer.toBinaryString(x);
        String yy = Integer.toBinaryString(y);
        String s1 = String.format("%32s", xx).replace(' ', '0');
        String s2 = String.format("%32s", yy).replace(' ', '0');
        System.out.println(s1);
        System.out.println(s2);
        int ans = 0;
        int n = s1.length();
        for(int i=0;i<n;i++){
            if(s1.charAt(i) != s2.charAt(i)){
                ans++;
            }
        }
        return ans;
    }
}