class Solution {
    public int setBits(int n){
        int ans=0;
        while(n!=0){
            if( (n&1)  == 1){
                ans++;
            } 
            n = n>>1;
        }
        return ans;
    }
    public char kthCharacter(int k) {
        // StringBuilder sb = new StringBuilder();
        // sb.append("a");
        // while(sb.length() < 500){
        //     StringBuilder temp = new StringBuilder();
        //     for(int i=0;i<sb.length();i++){
        //         char c = sb.charAt(i);
        //         temp.append( (char)  (((c-'a'+1)%26) + 'a')      );
        //     }
        //     sb.append(temp);
        // }
        // System.out.println(sb.toString());
        int ans = setBits(k-1);
        return  (char) ('a' + ans);
    }
}