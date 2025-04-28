class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder ans=new StringBuilder();
        int n=w1.length();
        int m=w2.length();
        int min=Math.min(n,m);
        String t1=w1.substring(0,min);
        String t2=w2.substring(0,min);
        int p1=0,p2=0;
        for(int i=0;i<min*2;i++){
            if(i%2==0){
                ans.append(w1.charAt(p1));
                p1++;
            }else{
                ans.append(w2.charAt(p2));
                p2++;
            }
        }
        String t3;
        if(n>m) t3=w1.substring(min,n);
        else t3=w2.substring(min,m);
        ans.append(t3);

        return ans.toString();
    }
}