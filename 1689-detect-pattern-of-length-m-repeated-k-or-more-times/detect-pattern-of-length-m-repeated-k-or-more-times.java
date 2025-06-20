class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int n = arr.length;
        for(int i=0;i<n-m;i++){
            int cnt=1;
            int []a=Arrays.copyOfRange(arr,i,i+m);
            for(int j=i+m;j<n;j+=m){
                int []b=Arrays.copyOfRange(arr,j,j+m);
                if(Arrays.equals(a,b)){
                    cnt++;
                }else{
                    break;
                }
            }
            if(cnt>=k) return true;
        }
        return false;
    }
}