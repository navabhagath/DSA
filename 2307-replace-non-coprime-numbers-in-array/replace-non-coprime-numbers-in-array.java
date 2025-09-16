class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer>st = new Stack<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            st.push(nums[i]);
            while(st.size() > 1){
                int num1 = st.get(st.size()-1);
                int num2 = st.get(st.size()-2);
                int g = gcd(num1,num2);
                if(g==1) break;
                st.pop();
                st.pop();
                long lcm1 =(1L * num1 * num2) / g;
                st.push((int)lcm1);
            } 
        }
        List<Integer>ans = new ArrayList<>();
        System.out.println(st);
        while(!st.isEmpty()){
            ans.add(0,st.pop());
        }
        return ans;
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}