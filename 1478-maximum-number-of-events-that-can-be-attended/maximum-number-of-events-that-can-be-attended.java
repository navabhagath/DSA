class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events,(a,b)->{
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }
            return a[1]-b[1];
        });
        for(int []e : events){
            System.out.println(e[0]+" "+e[1]);
        }
        int time=1;
        int cnt=0;
        int i=0;
        int n = events.length;
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        while(i<n || !pq.isEmpty()){
            if(pq.isEmpty()){
                time = Math.max(time,events[i][0]);
            }
            while(i<n && events[i][0] == time){
                pq.offer(events[i][1]);
                i++;
            }
            while(!pq.isEmpty() && pq.peek() < time){
                pq.poll();
            }
            if(!pq.isEmpty()){
                pq.poll();
                cnt++;
            }
            time++;
        }
        return cnt;
    }
}