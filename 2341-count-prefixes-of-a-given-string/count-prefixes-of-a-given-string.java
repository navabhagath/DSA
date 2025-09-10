class Solution {
    public int countPrefixes(String[] words, String s) {
        Set<String>hs = new HashSet<>();
        int n = s.length();
        int ans = 0;
        for(int i=0;i<n;i++){
            String temp = s.substring(0,i+1);
            hs.add(temp);
            System.out.println(temp);
        }
        for(String str : words){
            if(hs.contains(str)){
                ans++;
            }
        }
        return ans;
    }
}