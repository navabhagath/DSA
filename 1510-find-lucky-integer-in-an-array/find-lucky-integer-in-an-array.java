class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int num : arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int ans=-1;
        for(Map.Entry<Integer,Integer>en : mp.entrySet()){
            int key = en.getKey();
            int val = en.getValue();
            if(key == val){
                ans = key;
            }
        }
        return ans;
    }
}