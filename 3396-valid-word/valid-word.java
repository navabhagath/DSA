class Solution {
    public boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' ||        ch=='E' || ch=='I' || ch=='O' || ch=='U';
    }
    public boolean isValid(String word) {
        int n = word.length();
        if(n<3) return false;
        boolean c = false;
        boolean v = false;
        boolean num = false;
        boolean sym = false;
        for(char ch : word.toCharArray()){
            if(ch >='0' && ch<='9'){
                continue;
            }else if(isVowel(ch)){
                v = true;
            }else if(!isVowel(ch) && (ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                c = true;
            }else{
                return false;
            }
            
        }
        return v && c ;
    }
}