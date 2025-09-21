class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer>mp = new HashMap<>();
        Map<Integer,Integer>even = new HashMap<>();
        Map<Integer,Integer>odd = new HashMap<>();
        int ec=0,oc=0;
        for(int i=0;i<n;i++){
            if(i % 2 == 0){
                even.put(nums[i],even.getOrDefault(nums[i],0)+1);
                mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
                ec++;
            }else{
                odd.put(nums[i],odd.getOrDefault(nums[i],0)+1);
                mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
                oc++;
            }
        }
        if(mp.size() == 1){
            return Math.min(ec,oc);
        }
        PriorityQueue<int[]>epq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        PriorityQueue<int[]>opq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(Map.Entry<Integer,Integer>en : even.entrySet()){
            int []temp = new int[]{en.getKey() , en.getValue()};
            epq.add(temp);
        }
        for(Map.Entry<Integer,Integer>en : odd.entrySet()){
            int []temp = new int[]{en.getKey() , en.getValue()};
            opq.add(temp);
        }
        if(epq.peek()[0] != opq.peek()[0]){
            int ans = (ec - epq.peek()[1]) + (oc - opq.peek()[1]);
            return ans;
        }
        int []e1 = epq.poll();
        int []e2 = epq.isEmpty() ? new int[]{-1,0} : epq.poll();
        int []o1 = opq.poll();
        int []o2 = opq.isEmpty() ? new int[]{-1,0} : opq.poll();
        int x = (ec - e2[1]) + (oc -  o1[1]);
        int y = (oc - o2[1]) + (ec -  e1[1]);
        return Math.min(x,y); 
        
    }
}