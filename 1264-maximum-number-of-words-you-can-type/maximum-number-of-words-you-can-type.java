class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String []arr = text.split(" ");
        Set<Character>hs = new HashSet<>();
        for(char c : brokenLetters.toCharArray()){
            hs.add(c);
        }
        int cnt = 0;
        for(String str : arr){
            boolean found = false;
            for(int i=0;i<str.length();i++){
                if(hs.contains(str.charAt(i))){
                    found = true;
                    break;
                }
            }
            if(!found){
                cnt++;
            }
        }
        return cnt;
    }
}