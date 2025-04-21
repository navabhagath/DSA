class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int x=0,y=0,temp=0;
        for(int num:differences){
            temp+=num;
            x=Math.min(x,temp);
            y=Math.max(y,temp);

            if(y-x > upper-lower) return 0;
        }
        return (upper-lower)-(y-x)+1;
    }
}