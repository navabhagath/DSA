class Solution {
    public int totalMoney(int n) {
        int num = (n/7)+1;
        if(n <= 7){
            return (n * (n+1))/2; 
        }
        int []arr = new int[n];
        arr[0] = 1;
        for(int i=1;i<=6;i++){
            arr[i] = arr[i-1] + 1;
        }
        for(int i=7;i<n;i++){
            arr[i] = arr[i-7] + 1;
        }
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for(int x : arr) sum+=x;
        return sum;
    }
}