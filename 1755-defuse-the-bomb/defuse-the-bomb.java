class Solution {
    public int[] decrypt(int[] c, int k) {
        int n=c.length;
        int []ans=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            if(k>0){
                for(int j=i+1;j<=i+k;j++){
                    sum+=c[j%n];
                }
            }else if(k<0){
                for(int j=1;j<=-k;j++){
                    sum += c[(i-j+n)%n];
                }
            }
            ans[i]=sum;
        }
        return ans;
    }
}