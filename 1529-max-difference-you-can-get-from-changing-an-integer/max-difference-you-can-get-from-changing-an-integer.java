class Solution {
    public int maxDiff(int num) {
        String str = String.valueOf(num);
        String str1=str;
        String str2=str;
        int idx=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) < '9'){
                idx=i;
                break;
            }
        }
        str1 = str1.replace(str.charAt(idx),'9');
        for(int i=0;i<str2.length();i++){
            char  ch = str2.charAt(i);
            if(i==0){
                if(ch !='1'){
                    str2 = str2.replace(ch,'1');
                    break;
                }
            }else{
                if(ch !='0' && ch!=str2.charAt(0)){
                    str2 = str2.replace(ch,'0');
                    break;
                }
            }
        }
        System.out.println(str1);
        System.out.println(str2);
        return Integer.parseInt(str1) - Integer.parseInt(str2);
    }
}