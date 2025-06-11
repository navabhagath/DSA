class Solution {
    public static void f1(int i,int j,StringBuilder sb){
        while(i<j){
            sb.setCharAt(i++,'R');
            sb.setCharAt(j--,'L');
        }
    }
    public static void f2(int i,int j,StringBuilder sb){
        while(i<=j){
            sb.setCharAt(i++,'L');
        }
    }
    public static void f3(int i,int j,StringBuilder sb){
        while(i<=j){
            sb.setCharAt(i++,'R');
        }
    }
    public String pushDominoes(String dominoes) {
        StringBuilder sb = new StringBuilder(dominoes);
        int n = dominoes.length();
        int ll=-1,lr=-1;
        for(int i=0;i<n;i++){
            if(sb.charAt(i) == 'L'){
                if(ll<lr){
                    f1(lr,i,sb);
                }else if((ll>lr) || ll==-1){
                    f2(ll+1,i,sb);
                }
                ll=i;
            }else if(sb.charAt(i)=='R'){
                if(lr>ll){
                    f3(lr,i,sb);
                }
                lr=i;
            }
        }
        if(lr>ll){
            f3(lr,n-1,sb);
        }
        return sb.toString();
    }
}