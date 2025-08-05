class Solution {
    public String resultingString(String s) {
        int n = s.length();
        Stack<Character>st = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && 
            ((Math.abs( (int)ch - (int)st.peek() ) == 1) || 
            (ch == 'a' && st.peek() == 'z') || 
            (ch == 'z' && st.peek() == 'a')) ){
                st.pop();
            }else{
                st.push(ch);    
            }
            
        } 

        StringBuilder sb = new StringBuilder();
        for(char c : st){
            sb.append(c);
        }
        return sb.toString();
    }
}