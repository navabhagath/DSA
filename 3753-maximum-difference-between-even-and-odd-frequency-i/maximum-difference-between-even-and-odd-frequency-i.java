class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer>mp=new HashMap<>();
        for(char c : s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        List<Integer>even=new ArrayList<>();
        List<Integer>odd=new ArrayList<>();
        for(int num : mp.values()){
            if(num%2==0){
                even.add(num);
            }else{
                odd.add(num);
            }
        }
        int mine = Collections.min(even);
        int maxo = Collections.max(odd);
        return maxo-mine;
    }
}