class Solution {
    public int[] evenOddBit(int n) {
        String bin = Integer.toBinaryString(n);
        String sb=new StringBuilder(bin).reverse().toString();
        int even=0;
        int odd=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1'){
                if(i%2==0) even++;
                else odd++;
            }
        }
        System.out.println(sb);
        return new int[]{even,odd};
    }
}