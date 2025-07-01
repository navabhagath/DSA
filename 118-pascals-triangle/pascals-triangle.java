class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>>ans=new ArrayList<>();
        if(n == 0) return ans;
        List<Integer>first = new ArrayList<>();
        first.add(1);
        ans.add(first);
        if(n==1) return ans;
        for(int i=1;i<n;i++){
            List<Integer>prev = ans.get(i-1);
            List<Integer>curr = new ArrayList<>();
            curr.add(1);
            for(int j=0;j<i-1;j++){
                curr.add(prev.get(j) + prev.get(j+1));
            }
            curr.add(1);
            ans.add(curr);
        }
        return ans;
    }
}