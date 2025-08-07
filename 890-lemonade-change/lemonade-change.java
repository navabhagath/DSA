class Solution {
    public boolean lemonadeChange(int[] bills) {
        int cnt5 = 0;
        int cnt10 = 0;
        for(int num : bills){
            if(num == 5){
                cnt5++;
            }else if(num == 10){
                if(cnt5 == 0) return false;
                cnt5--;
                cnt10++;
            }else if(num == 20){
                if(cnt5>=1 && cnt10 >= 1){
                    cnt5--;
                    cnt10--;
                }
                else if(cnt5>=3){
                    cnt5-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
        
    }
}