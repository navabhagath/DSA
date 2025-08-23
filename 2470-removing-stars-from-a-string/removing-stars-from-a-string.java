class Solution {
    public String removeStars(String s) {
        Stack<Character>st = new Stack<>();
        int n = s.length();
        for(char ch : s.toCharArray()){
            if(!st.empty() && ch == '*'){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        System.out.println(st);
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        String ans = sb.reverse().toString();
        return ans;
    }
}