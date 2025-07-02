class Solution {
    public boolean checkString(String s) {
        int cnta=0;
        int cntb=0;
        for(char c : s.toCharArray()){
            if(c=='a'){
                cnta++;
            }else{
                cntb++;
            }
        }
        for(char c : s.toCharArray()){
            if(c=='a'){
                cnta--;
            }else if(c == 'b' && cnta !=0 ){
                return false;
            }
        }
        return true;
    }
}