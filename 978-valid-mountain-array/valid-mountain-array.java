class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n<2) return false;
        int i=0;
        int j=n-1;
        while(i+1<j && arr[i]<arr[i+1]) i++;
        while(j-1>0 && arr[j]<arr[j-1]) j--;

        return i==j;
    }
}