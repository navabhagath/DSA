class Solution {
    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        Map<String,Long>mp1 = new HashMap<>();
        Map<String,String>mp2 = new HashMap<>();
        Map<String,Integer>mp3 = new HashMap<>();

        int n = creators.length;
        for(int ii=0;ii<n;ii++){
            String c = creators[ii];
            String i = ids[ii];
            int v = views[ii];
            mp1.put(c, mp1.getOrDefault(c, 0L) + v);
            if(!mp3.containsKey(c) || v > mp3.get(c) || (v==mp3.get(c) && i.compareTo(mp2.get(c) )<0)){
                mp3.put(c,v);
                mp2.put(c,i);
            }
        }
        long maxi = 0;
        for(long num : mp1.values()){
            maxi = Math.max(num,maxi);
        }
        List<List<String>>ans = new ArrayList<>();
        for(String cre : mp1.keySet()){
            if(mp1.get(cre) == maxi){
                ans.add(Arrays.asList(cre,mp2.get(cre)));
            }
        }
        return ans;
    }
}