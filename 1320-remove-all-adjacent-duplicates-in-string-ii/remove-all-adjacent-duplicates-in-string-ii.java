class Solution {
    class Pair{
        char ch;
        int cnt;
        Pair(char ch,int cnt){
            this.ch = ch;
            this.cnt = cnt;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair>st = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char curr = s.charAt(i);
            if(!st.isEmpty() && st.peek().ch == curr){
                st.peek().cnt++;
            }else{
                st.push(new Pair(curr,1));
            }
            if(st.peek().cnt == k){
                st.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            Pair x = st.pop();
            for(int i=0;i<x.cnt;i++){
                sb.append(x.ch);
            }
        }
        return sb.reverse().toString();
    }
}