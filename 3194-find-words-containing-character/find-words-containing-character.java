class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>ans = new ArrayList<>();
        int n = words.length;
        for(int i=0;i<n;i++){
            String str = words[i];
            String ch = Character.toString(x);
            if(str.contains(ch)){
                ans.add(i);
            }
        }
        return ans;
    }
}