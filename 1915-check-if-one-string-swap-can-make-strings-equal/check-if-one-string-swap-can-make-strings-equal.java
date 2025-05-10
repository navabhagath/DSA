class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        int cnt=0;
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            char cc = s2.charAt(i);
            if(c != cc){
                cnt++;
                if(cnt>2) return false;
            }
        }
        boolean flag = true;
        for(char ch : s1.toCharArray()){
            f1[ch-'a']++;
        }
        for(char ch : s2.toCharArray()){
            f2[ch-'a']++;
        }
        return Arrays.equals(f1,f2);
    }
}