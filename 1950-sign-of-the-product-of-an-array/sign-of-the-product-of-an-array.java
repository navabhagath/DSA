class Solution {

    public int arraySign(int[] nums) {
        long prod = 0;
        int temp = 0;
        for(int num : nums){
            if(num == 0) return 0;
            else if(num >=1 ){
                temp++;
            }else{
                prod++;
            }
        }

        if(prod%2!=0) return -1;
        
        return 1;
    }
}