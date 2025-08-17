class Solution {
    public int convertTime(String current, String correct) {
        String []arr1 = current.split(":");
        String []arr2 = correct.split(":");
        int first = (Integer.parseInt(arr1[0]) * 60 ) + Integer.parseInt(arr1[1]);
        int second = (Integer.parseInt(arr2[0]) * 60 ) + Integer.parseInt(arr2[1]);
        int dif = Math.abs(first - second);
        System.out.println(dif);
        int cnt = 0;
        while(dif!=0){
            if(dif >= 60){
                dif-=60;
                cnt++;
            }else if(dif>=15){
                dif -= 15;
                cnt++;
            }else if(dif >= 5){
                dif-=5;
                cnt++;
            }else{
                dif-=1;
                cnt++;
            }
        }
        return cnt;

    }
}