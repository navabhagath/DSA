class Solution {
    public int minimizedStringLength(String s) {
        Set<Character>hs=new HashSet<>();
        for(char c : s.toCharArray()){
            hs.add(c);
        }
        return hs.size();
    }
}