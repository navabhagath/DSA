class Solution {
    public int halveArray(int[] nums) {
        int n = nums.length;
        double sum = 0;
        for(int num : nums){
            sum = sum +(double) num;
        }
        PriorityQueue<Double>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            pq.offer((double)num);
        }
        int cnt = 0;
        double half = sum/2;
        while(sum > half){
            double x = pq.poll();
            pq.offer(x/2.0);
            sum -= x/2.0;
            cnt++;
        }
        return cnt;
    }
}