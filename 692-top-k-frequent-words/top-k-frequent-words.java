class Pair{
    String first;
    int second;
    Pair(String first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int n = words.length;
        HashMap<String,Integer>mp = new HashMap<>();
        for(String str : words){
            mp.put(str , mp.getOrDefault(str,0)+1);
        }
        Pair []arr = new Pair[mp.size()];
        int idx = 0;
        for(Map.Entry<String,Integer>en : mp.entrySet()){
            String key = en.getKey();
            int frq = en.getValue();
            arr[idx] = new Pair(key , frq);
            idx++;
        }
        Arrays.sort(arr,(a,b)->{
            if(a.second == b.second){
                return a.first.compareTo(b.first);
            }
            return Integer.compare(b.second,a.second);
        });
        List<String>ans = new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(arr[i].first);
        }
        return ans;
    }
}