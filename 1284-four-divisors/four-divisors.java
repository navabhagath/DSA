class Solution {
    
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for(int num : nums){
            List<Integer>temp = helper(num);
            if(temp.size() == 4 ){
                for(int x : temp){
                    ans+=x;
                }
            }
        }
        return ans;
    }
    public List<Integer> helper(int n){
        List<Integer>al = new ArrayList<>();
        int cnt = 0;
        for(int i=1;i<=n/i;i++){
            if(n%i == 0){
                cnt++;
                al.add(i);
                if(n/i != i){
                    cnt++;
                    al.add(n/i);
                }
            }
        }
        return al;
    }
}