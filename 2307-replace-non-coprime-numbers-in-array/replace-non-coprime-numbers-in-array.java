class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer>st = new Stack<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            st.push(nums[i]);
           while(st.size() > 1){
                int num1 = st.get(st.size()-1); 
                int num2 = st.get(st.size()-2); 
                if(gcd(num1,num2) > 1){ 
                    long lcm1 = ( 1L * num1 * num2 ) / gcd(num1,num2); 
                    st.pop(); 
                    st.pop(); 
                    st.push((int)lcm1); 
                }else{
                    break;
                }
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