class Solution {
    public int binaryGap(int n) {
        String bin = Integer.toBinaryString(n);
        System.out.println(bin);
        int res=0;
        int len = bin.length();
        int last = -1;
        for(int i=0;i<len;i++){
            if(bin.charAt(i) == '1'){
                if(last !=-1 ){
                    res = Math.max(res,i-last);
                }
                last = i;
            }
        }
        return res;      
    }
}