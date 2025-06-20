class Pair{
        char ch;
        int cnt;
        Pair(char ch,int cnt){
            this.ch = ch;
            this.cnt = cnt;
        }
    }
class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        Stack<Pair>st = new Stack<>();
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
            Pair p = st.pop();
            for(int i=0;i<p.cnt;i++){
                sb.append(p.ch);
            }
        }
        return sb.reverse().toString();
    }
    
}