class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int totalcost = 0;
        int n = gas.length;
        for(int i=0;i<n;i++){
            totalgas += gas[i];
            totalcost += cost[i];
        }
        if(totalcost > totalgas){
            return -1;
        }
        int curr = 0,start = 0;
        for(int i=0;i<n;i++){
            curr += (gas[i] - cost[i]);
            if(curr < 0){
                curr = 0;
                start = i+1;
            }
        }
        return start;
    }
}