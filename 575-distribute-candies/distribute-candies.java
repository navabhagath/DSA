class Solution {
    public int distributeCandies(int[] c) {
        Set<Integer>st=new HashSet<>();
        for(int i : c) st.add(i);
        int n = c.length/2;
        return n<=st.size() ? n : st.size();
    }
}