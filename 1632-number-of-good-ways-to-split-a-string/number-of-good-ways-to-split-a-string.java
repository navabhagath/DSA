class Solution {
    public int numSplits(String s) {
        Map<Character,Integer>mp = new HashMap<>();
        Map<Character,Integer>total = new HashMap<>();
        for(char c : s.toCharArray()){
            total.put(c,total.getOrDefault(c,0)+1);
        }
        int n = s.length();
        int ans = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);

            int value = total.get(ch)-1;
            if(value==0){
                total.remove(ch);;
            }else{
                total.put(ch,value);
            }
            if(mp.size() == total.size()){
                ans++;
            }
        }
        return ans;
    }
}