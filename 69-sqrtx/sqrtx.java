class Solution {
    public int mySqrt(int x) {
        long l=0;
        long h=x;
        long ans=0;
        while(l<=h){
            long mid = l+(h-l)/2;
            long sq = mid*mid;
            if(sq==x){
                ans=mid;
                break;
            }else if(sq>x){
                h = mid-1;
            }else{
                ans=mid;
                l=mid+1;
            }
        }
        return (int)ans;
    }
}