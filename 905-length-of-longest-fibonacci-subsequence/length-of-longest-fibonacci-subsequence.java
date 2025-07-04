class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        Set<Integer>hs = new HashSet<>();
        for(int num : arr){
            hs.add(num);
        }
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int prev = arr[j];
                int curr = arr[j] + arr[i];
                int len = 2;
                while(hs.contains(curr)){
                    int temp = curr;
                    curr = curr + prev;
                    prev = temp;
                    len++;
                    max = Math.max(max,len);
                }
            }
        }
        return max;

    }
}