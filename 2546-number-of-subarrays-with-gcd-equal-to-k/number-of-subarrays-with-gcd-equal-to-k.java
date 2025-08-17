class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        for(int i=0;i<n;i++){
            int curhcf = nums[i];
            if(curhcf == k) cnt++;
            for(int j=i+1;j<n;j++){
                curhcf = hcf(curhcf , nums[j]);
                if(curhcf == k){
                    cnt++;
                }
                
            }
        }
        return cnt;
        
    }
    public int hcf(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}