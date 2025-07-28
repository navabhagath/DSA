class Solution {
    public List<List<Integer>> helper(int []nums){
        int n = nums.length;
        List<List<Integer>>ans = new ArrayList<>();
        for(int i=0;i<(1<<n);i++){
            List<Integer>al = new ArrayList<>();
            for(int j=0;j<n;j++){
                if( (i & (1<<j)) != 0 ){
                    al.add(nums[j]);
                }
            }
            ans.add(al);
        }
        return ans;
    }
    public int countMaxOrSubsets(int[] nums) {
        int orr = 0;
        int n = nums.length;
        for(int num : nums){
            orr = orr | num;
        }
        List<List<Integer>>ans = helper(nums);
        int cnt = 0;
        for(List<Integer>x : ans){
            int torr = 0;
            for(int y : x){
                torr = torr | y;
            }
            if(torr == orr) cnt++;
        }
        return cnt;
    }
}