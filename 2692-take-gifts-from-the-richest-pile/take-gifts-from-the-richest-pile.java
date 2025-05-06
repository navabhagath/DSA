class Solution {
    public long pickGifts(int[] gifts, int k) {
        int n =gifts.length;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num : gifts){
            pq.offer(num);
        }
        while(k-->0){
            if(pq.isEmpty()) break;
            int cur = pq.poll();
            int sq = (int)Math.sqrt(cur);
            pq.offer(sq);
        }
        long ans=0;
        while(!pq.isEmpty()) ans+=pq.poll();

        return ans;
    }
}