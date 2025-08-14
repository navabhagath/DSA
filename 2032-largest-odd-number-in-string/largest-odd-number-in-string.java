class Solution {
    public String largestOddNumber(String num) {
        boolean found = false;
        int n = num.length();
        int idx = -1;
        for(int i=n-1;i>=0;i--){
            int x = num.charAt(i) - '0';
            if(x%2 == 1){
                idx = i;
                found = true;
                break;
            }
        }   
        if(!found){
            return "";
        }
        return num.substring(0,idx+1);
    }
}