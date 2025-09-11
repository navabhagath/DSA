class Solution {
    public String sortVowels(String s) {
        int n = s.length();
        List<Character>al = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(isVowel(ch)){
                al.add(ch);
            }
        }
        Collections.sort(al);
        int idx = 0;
        char []ans = new char[n];
        for(int i=0;i<n;i++){
            if(isVowel(s.charAt(i))){
                ans[i] = al.get(idx);
                idx++;
            }else{
                ans[i] = s.charAt(i);
            }
        }
        return new String(ans);
    }
    public boolean isVowel(char ch){
        return ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'  ||
                ch == 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'; 
    }
}