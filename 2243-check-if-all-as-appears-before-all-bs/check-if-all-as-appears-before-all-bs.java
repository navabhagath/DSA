class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        Stack<Character>st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='b'){
                st.push(c);
            }else{
                if(c=='a' && st.isEmpty()){
                    st.push(c);
                }else if(c=='a' && st.peek() == 'b'){
                    return false;
                }
            }
        }
        return true;
    }
}