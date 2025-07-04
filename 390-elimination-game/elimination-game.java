class Solution {
    public int lastRemaining(int n) {
        return helper(n,true);
    }
    public int helper(int n,boolean flag){
        if(n==1) {
            return 1;
        }
        if(flag || n%2==1){
            return 2*helper(n/2,!flag);
        }
        return 2*helper(n/2,!flag)-1;
    }
}