class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double,Integer>mp = new HashMap<>();
        for(int []x : rectangles){
            int a = x[0];
            int b = x[1];
            double val = ( (double)a/b);
            mp.put(val,mp.getOrDefault(val,0)+1);
        }
        long ans = 0;
        for(int num : mp.values()){
            if(num > 1){
                ans += ((long)num * (num-1)) / 2;
            }
        }
        return ans;
    }
}