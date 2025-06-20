class Solution {
    public boolean judgeSquareSum(int c) {
        long l=0;
        long h = (int)Math.sqrt(c);
        while(l<=h){
            long sq = l*l + h*h;
            if(sq==c){
                return true;
            }else if(sq > c){
                h--;
            }else{
                l++;
            }
        }
        return false;
    }
}