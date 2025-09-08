class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int n = queries.length;
        int []ans = new int[n];
        int ind = 0;
        for(int []x : queries){
            int k = x[0];
            int t = x[1];
            String [][]arr = new String[nums.length][2];
            for(int i=0;i<nums.length;i++){
                arr[i][0] = helper(nums[i] , t);
                arr[i][1] = String.valueOf(i);
            }
            Arrays.sort(arr,(a,b)->{
                int y = a[0].compareTo(b[0]);
                if(y == 0){
                    return Integer.parseInt(a[1]) - Integer.parseInt(b[1]);
                }
                return y;
            });
            ans[ind++] = Integer.parseInt(arr[k-1][1]);
        }
        return ans;
    }
    public String helper(String str,int t){
        int n = str.length();
        String temp = str.substring(n-t,n);
        return temp;
    }
}