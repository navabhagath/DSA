class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1=0,sum2=0;
        long z1=0,z2=0;
        for(int num : nums1){
            sum1+=num;
            if(num==0) z1++;
        }
        for(int num : nums2){
            sum2+=num;
            if(num==0) z2++;
        }
        sum1+=z1;
        sum2+=z2;
        if((sum1<sum2 && z1==0) || (sum2<sum1 && z2==0)){
            return -1;
        }
        return Math.max(sum1,sum2);
    }
}