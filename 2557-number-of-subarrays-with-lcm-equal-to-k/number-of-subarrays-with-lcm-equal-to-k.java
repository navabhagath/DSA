class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        for(int i=0;i<n;i++){
            int curlcm = nums[i];
            for(int j=i;j<n;j++){
                curlcm = lcm(curlcm,nums[j]);
                if(curlcm == k){
                    cnt++;
                }
                else if(curlcm > k && (curlcm % k!=0) && (k % curlcm!=0)){
                    break;
                }
            }
        }
        return cnt;
    }
    public int hcf(int a,int b){
        while(b!=0){
            int temp = b;
            b=a%b;
            a = temp;
        }
        return a;
    }
    public int lcm(int a,int b){
        int l = ((int)(1L*a*b)/hcf(a,b));
        return l;
    }
}