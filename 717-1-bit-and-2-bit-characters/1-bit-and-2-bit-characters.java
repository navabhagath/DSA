class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        Stack<Integer>st = new Stack<>();
        int n = bits.length;
        for(int i=0;i<n;i++){
            int curr = bits[i];
            if(st.isEmpty()){
                st.push(curr);
            }else{
                int top = st.peek();
                if(top == 1){
                    st.pop();
                    st.clear();
                }else{
                    st.push(curr);
                }
            }
        }
        return st.size()>=1 && st.peek()==0 && bits[n-1]==0;
    }
}