class Solution {
    public char findTheDifference(String s, String t) {
        int []f1 = new int[26];
        int []f2 = new int[26];
        for(char ch : s.toCharArray()){
            f1[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            f2[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(f1[i] != f2[i]){
                return (char)(i+'a');
            }
        }
        return 'a';
    }
}