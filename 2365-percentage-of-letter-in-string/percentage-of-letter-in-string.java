class Solution {
    public int percentageLetter(String s, char l) {
        int n = s.length();
        Map<Character,Integer>mp=new HashMap<>();
        for(char c : s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        int x= mp.getOrDefault(l,0);
        return (x*100)/n;
    }
}