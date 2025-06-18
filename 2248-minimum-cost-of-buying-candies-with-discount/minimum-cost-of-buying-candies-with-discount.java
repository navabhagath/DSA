class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length == 1){
            return cost[0];
        }
        if(cost.length == 2){
            return cost[0]+cost[1];
        }
        int n = cost.length;
        Arrays.sort(cost);
        int total = Arrays.stream(cost).sum();
        int del=0;
        for(int i=n-3;i>=0;i-=3){
            del+=cost[i];
        }
        return total - del;
    }
}