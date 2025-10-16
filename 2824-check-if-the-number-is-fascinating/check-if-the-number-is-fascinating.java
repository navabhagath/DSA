class Solution {
    public boolean isFascinating(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(n));
        sb.append(String.valueOf(2*n));
        sb.append(String.valueOf(3*n));
        String str = sb.toString();
        String temp = "0";
        if(str.contains(temp)) return false;
        Set<Character>hs = new HashSet<>();
        for(char c : str.toCharArray()){
            hs.add(c);
        }
        return str.length() == hs.size();
    }
}