class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if(x+y < target) return false;
        if(target == 0) return true;
        return target % gcd(x,y) == 0;
    }
    public int gcd(int a,int b){
        if(b==0) return a;
        if(a==0) return b;
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        if(a==0) return b;
        return a;
    }
}