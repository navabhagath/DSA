class Solution {
    public long gcd(long a,long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public long lcm(long a,long b){
        return (a*b) / gcd(a,b);
    }
    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            long prod=nums[i],gcd=nums[i],lcm=nums[i];
            for(int j=i+1;j<n;j++){
                prod*=(long)nums[j];
                if(prod > Long.MAX_VALUE) break;
                lcm = lcm(lcm,(long)nums[j]);
                gcd = gcd(gcd,(long)nums[j]);
                if(prod == lcm*gcd){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
}