class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        // if(n<=3) return false;
        // int i=0;
        // while(i+1<n && nums[i]<nums[i+1]){
        //     i++;
        // }
        // int p=i;
        // if(p==0) return false;
        // while(i+1<n && nums[i]>nums[i+1]){
        //     i++;
        // }
        // int q=i;
        // if(q==1 || q==p) return false;
        // while(i+1<n && nums[i]<nums[i+1]){
        //     i++;
        // }
        // System.out.println(i);
        // return i==n-1;
        boolean p=false;
        boolean q=false;
        boolean end = false;
        for(int i=1;i<n;i++){
            if(nums[i] > nums[i-1] && !q && !end){
                p=true;
            }else if(nums[i]<nums[i-1] && p && !end){
                q=true;
            }else if(nums[i]>nums[i-1] && q && p){
                end = true;
            }else{
                return false;
            }
        }
        return p && q && end;
        
    }
}