class Solution {
    public int maximumGain(String s, int x, int y) {
        int ans1 = solve(s,'a','b',x,y);
        int ans2 = solve(s,'b','a',y,x);
        return Math.max(ans1,ans2);
    }
    public int solve(String str,char f,char s,int x,int y){
        Stack<Character>st = new Stack<>();
        int score = 0;
        for(char c : str.toCharArray()){
            if(!st.isEmpty() && c==s && st.peek() == f){
                score+=x;
                st.pop();
            }else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        Stack<Character>st2 = new Stack<>();
        String temp = sb.reverse().toString();
        for(char ch : temp.toCharArray()){
            if(!st2.isEmpty() && ch == f && st2.peek() == s){
                score+=y;
                st2.pop();
            }else{
                st2.push(ch);
            }
        }
        return score;
    }
}