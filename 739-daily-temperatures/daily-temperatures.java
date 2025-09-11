class Solution {
    public int[] dailyTemperatures(int[] nums) {
        Stack<Integer>st = new Stack<>();
        int n = nums.length;
        int []ans = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[i] >= nums[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()) ans[i] = st.peek() -i;
            
            st.push(i);
        }
        return ans;
    }

}