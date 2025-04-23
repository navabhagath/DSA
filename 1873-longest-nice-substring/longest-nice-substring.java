class Solution {
    public String longestNiceSubstring(String s) {
        int n=s.length();
        if(n<2) return "";

        char[] arr=s.toCharArray();
        Set<Character>set=new HashSet<>();
        for(char c : arr) set.add(c);

        for(int i=0;i<arr.length;i++){
            char c=arr[i];
            if(set.contains(Character.toUpperCase(c)) && set.contains(Character.toLowerCase(c))){
                continue;
            }
            String s1 = longestNiceSubstring(s.substring(0,i));
            String s2= longestNiceSubstring(s.substring(i+1));
            return s1.length()>=s2.length()?s1:s2;
        }
        return s;
    }
}