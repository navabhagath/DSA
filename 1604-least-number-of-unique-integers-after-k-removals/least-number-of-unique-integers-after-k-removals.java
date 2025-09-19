class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        int n = arr.length;
        Map<Integer,Integer>mp = new HashMap<>();
        List<Integer>al = new ArrayList<>();
        for(int x : arr){
            mp.put(x,mp.getOrDefault(x,0)+1);
            al.add(x);
        }
        Collections.sort(al,(a,b)->{
            int x = mp.get(a);
            int y = mp.get(b);
            if(x != y){
                return Integer.compare(x,y);
            }
            return Integer.compare(a,b);
        });
        for(int num : al) System.out.print(num + " ");
        for(int i=0;i<k;i++){
            int curr = al.get(i);
            mp.put(curr,mp.get(curr)-1);
            if(mp.get(curr) == 0){
                mp.remove(curr);
            }
        }
        return mp.size();
    }
}