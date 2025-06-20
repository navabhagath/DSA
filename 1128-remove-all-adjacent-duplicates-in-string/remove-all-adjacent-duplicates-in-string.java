class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(!st.isEmpty() && st.peek() == c){
                st.pop();
            }else{
                st.push(c);
            }
        }
        System.out.println(st);
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
        
    }
}