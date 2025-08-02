class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        int n = basket1.length;
        Map<Integer,Integer>mp = new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(basket1[i],mp.getOrDefault(basket1[i],0)+1);
            mp.put(basket2[i],mp.getOrDefault(basket2[i],0)-1);
        }
        int min1 = Arrays.stream(basket1).min().getAsInt();
        int min2 = Arrays.stream(basket2).min().getAsInt();
        int min = Math.min(min1,min2);
        List<Integer>temp = new ArrayList<>();
        for(Integer key : mp.keySet()){
            int cnt = mp.get(key);
            if(cnt%2!=0) return -1;
            for(int i=0;i<Math.abs(cnt/2);i++){
                temp.add(key);
            }
        }
        Collections.sort(temp);
        long ans = 0;
        for(int i=0;i<temp.size()/2;i++){
            ans+= Math.min(min*2,temp.get(i));
        }
        return ans;
    }
}