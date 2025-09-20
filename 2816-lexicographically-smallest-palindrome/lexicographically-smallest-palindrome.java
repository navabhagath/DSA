class Solution {
    public String makeSmallestPalindrome(String s) {
        char []arr = s.toCharArray();
        int i=0,j=arr.length-1;
        while(i < j){
            char c1 = arr[i];
            char c2 = arr[j];
            if(c1 <= c2){
                arr[i] = c1;
                arr[j] = c1;
            }else{
                arr[i] = c2;
                arr[j] = c2;
            }
            i++;
            j--;
        }
        return new String(arr);
    }
}