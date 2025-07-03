class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;
        int []suff = new int[n];
        suff[n-1] = shifts[n-1] % 26;
        for(int i=n-2;i>=0;i--){
            suff[i] = (shifts[i] + suff[i+1]) % 26;
        }
        for(int num : suff) System.out.print(num+" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int k = suff[i];
            sb.append( (char) (((ch-'a'+ k)%26)+'a')   );
        }
        System.out.println(sb);
        return sb.toString();
    }
}