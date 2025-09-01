class Solution {
    private double gain(int s,int t){
        double a = (double)(s+1) / (t+1);
        double b = (double)s/t;
        return a-b;
    }
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        double ans = 0;
        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->{
            double x = gain(a[0],a[1]);
            double y = gain(b[0],b[1]);
            return Double.compare(y,x);
        });
        for(int []c : classes){
            pq.offer(new int[]{c[0] , c[1]});
        }
        while(extraStudents-->0){
            int []curr = pq.poll();
            curr[0]+=1;
            curr[1]+=1;
            pq.offer(curr);
        }
        for(int []c : pq){
            ans+= (double)c[0]/c[1];
        }
        return ans / classes.length;
    }
}