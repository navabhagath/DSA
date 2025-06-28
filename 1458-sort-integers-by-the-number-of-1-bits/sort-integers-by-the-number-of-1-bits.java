class Solution {
    public int setBits(int n){
        int cnt=0;
        while(n!=0){
            if( (n&1) == 1 ){
                cnt++;
            }
            n = n>>1;
        }
        return cnt;
    }
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int [][]temp = new int[n][2];
        for(int i=0;i<n;i++){
            temp[i][0] = arr[i];
            temp[i][1] = setBits(arr[i]);
        }
        Arrays.sort(temp,(a,b) -> Integer.compare(a[1],b[1]));

        int []ans = new int[n];

        for(int i=0;i<n;i++){
            ans[i] = temp[i][0];
        }

        return ans;
    }
}