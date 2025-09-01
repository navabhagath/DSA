class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer>mp = new HashMap<>();
        int n = list1.length;
        for(int i=0;i<n;i++){
            mp.put(list1[i] , i);
        }
        int minsum = Integer.MAX_VALUE;
        int m = list2.length;
        for(int i=0;i<m;i++){
            String str = list2[i];
            if(mp.containsKey(str)){
                minsum = Math.min(minsum , i + mp.get(str));
            }
        }
        List<String>ans = new ArrayList<>();
        for(int i=0;i<m;i++){
            String str = list2[i];
            if(mp.containsKey(str)){
                if((i+mp.get(str)) == minsum ){
                    ans.add(str);
                }
            }
        }
        String []res = new String[ans.size()];
        int idx = 0;
        for(int i=0;i<ans.size();i++){
            res[idx++] = ans.get(i);
        }
        return res;
    }
}