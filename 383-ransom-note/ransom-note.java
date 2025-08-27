class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int []f1 = new int[26];
        int []f2 = new int[26];
        for(char ch : ransomNote.toCharArray()){
            f1[ch-'a']++;
        }
        for(char ch : magazine.toCharArray()){
            f2[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(f2[i] < f1[i]){
                return false;
            }
        }
        return true;
    }
}