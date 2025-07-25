class Solution {
    public boolean helper(String s, String t) {
        Map<Character,Integer>mp1=new HashMap<>();
        Map<Character,Integer>mp2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char t1=s.charAt(i);
            char t2=t.charAt(i);
            if(!mp1.containsKey(t1)){
                mp1.put(t1,i);
            }
            if(!mp2.containsKey(t2)){
                mp2.put(t2,i);
            }
            if(!mp1.get(t1).equals(mp2.get(t2))){
                return false;
            }
        }
        return true;
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String>ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(helper(words[i],pattern)){
                ans.add(words[i]);
            }
        }
        return ans;
    }
}