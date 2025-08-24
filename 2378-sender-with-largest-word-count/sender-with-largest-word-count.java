class Pair{
    String name;
    int cnt;
    Pair(String name , int cnt){
        this.name = name;
        this.cnt = cnt;
    }
}
class Solution {
    public String largestWordCount(String[] m, String[] s) {
        HashMap<String,Integer>mp = new HashMap<>();
        int n = m.length;
        for(int i=0;i<n;i++){
            String str = s[i];
            String msg = m[i];
            int count = helper(msg);
            if(!mp.containsKey(str)){
                mp.put(str,count);
            }else{
                int val = mp.get(str);
                mp.remove(str);
                mp.put(str,val + count);
           }
        }
        Pair []arr = new Pair[mp.size()];
        int idx = 0;
        for(Map.Entry<String,Integer>en : mp.entrySet()){
            String curr = en.getKey();
            int cntt = en.getValue();
            arr[idx] = new Pair(curr,cntt);
            idx++;
        }
        Arrays.sort(arr,(a,b) -> {
            if(a.cnt == b.cnt){
                return b.name.compareTo(a.name);
            }
            return Integer.compare(b.cnt,a.cnt);
        });
        String ans = arr[0].name;
        return ans;
    }
    private int helper(String msg){
        String []arr = msg.split("\\s+");
        return arr.length;
    }
}