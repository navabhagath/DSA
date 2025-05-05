class Solution {
    public long[] sumOfThree(long num) {
        long []ans=new long[3];
        long temp=num%3;
        boolean flag=false;
        if(temp==0){
            flag=true;
            long x = num/3;
            ans[0]=x-1;
            ans[1]=x;
            ans[2]=x+1;
        }
        return flag ? ans : new long[]{};
    }
}