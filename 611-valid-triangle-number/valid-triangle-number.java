class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int cnt = 0;
        int n = nums.length;
        for(int k=n-1;k>=2;k--){
            int i=0,j=k-1;
            while(i<j){
                if(nums[i] + nums[j] > nums[k]){
                    cnt+=(j-i);
                    j--;
                }else{
                    i++;
                }
            }
        }
        return cnt;
    }
    public boolean isTriangle(int a,int b,int c){
        if( ((a+b) > c)  && ((b+c) > a)   && ((c+a) > b) ){
            return true;
        }
        return false;
    }
}