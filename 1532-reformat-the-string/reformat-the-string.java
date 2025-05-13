class Solution {
    public String reformat(String s) {
        String temp1="";
        String temp2="";
        int ccnt=0,ncnt=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch <='z'){
                temp1+=ch;
                ccnt++;
            }else{
                temp2+=ch;
                ncnt++;
            }
        }
        System.out.println(temp1+" "+temp2+" "+ccnt+" "+ncnt);
        int diff = Math.abs(ccnt-ncnt);
        if(diff>1 ) return "";
        int i=0,j=0,n=temp1.length(),m=temp2.length();
        StringBuilder ans = new StringBuilder();
        while(i<n && j<m){
            if(n>=m){
                ans.append(temp1.charAt(i));
                ans.append(temp2.charAt(j));
               // System.out.println(ans.toString());
                i++;
                j++;
            }else{
                ans.append(temp2.charAt(j));
                ans.append(temp1.charAt(i));
                j++;
                i++;
            }
        }
        while(i<n){
            ans.append(temp1.charAt(i++));
        }
        while(j<m){
            ans.append(temp2.charAt(j++));
        }
        return ans.toString();
    }
}