class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            pq.offer(num);
        }
        while(k-->1){
            pq.poll();
        }
        int ans = pq.peek();
        return ans;
    }
}