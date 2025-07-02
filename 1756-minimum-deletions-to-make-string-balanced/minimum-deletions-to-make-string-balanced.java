class Solution {
    public int minimumDeletions(String s) {
        Stack<Character>st = new Stack<>();
        int n = s.length();
        int del = 0;
        for(char c : s.toCharArray()){
            if(c=='b'){
                st.push(c);
            }else{
                if(!st.isEmpty() && st.peek()=='b'){
                    del++;
                    st.pop();
                }else{
                    st.push(c);
                }
            }
        }

        System.out.println(st);

        return del;
    }
}