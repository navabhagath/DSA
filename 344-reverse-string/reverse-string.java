class Solution {
    public void swap(char []arr,int i,int j){
        char temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            swap(s,i,j);
            i++;
            j--;
        }
    }
}