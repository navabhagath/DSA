class Solution {
    public int minMaxDifference(int num) {
        String str = String.valueOf(num);
        String max = str;
        String min = str;
        int idx=0;
        int n = str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i) < '9'){
                idx=i;
                break;
            }
        }
        max = max.replace(str.charAt(idx),'9');
        char c = str.charAt(0);
        min = min.replace(c,'0');
        System.out.println(max);
        System.out.println(min);
        return Integer.parseInt(max) - Integer.parseInt(min);
    }
}