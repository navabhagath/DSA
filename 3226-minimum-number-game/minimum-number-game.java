class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int num : nums){
            pq.add(num);
        }
        List<Integer>al=new ArrayList<>();
        while(!pq.isEmpty()){
            int temp = pq.poll();
            al.add(pq.poll());
            al.add(temp);
        }
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=al.get(i);
        }
        return nums;
    }
}