class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>>res = new ArrayList<>();
        if(n==0) return res;
        List<Integer>first = new ArrayList<>();
        first.add(1);
        res.add(first);
        if(n==1) return res;
        for(int i=1;i<n;i++){
            List<Integer>prev = res.get(i-1);
            List<Integer>curr = new ArrayList<>();
            curr.add(1);
            for(int j=0;j<i-1;j++){
                curr.add(prev.get(j+1) + prev.get(j));
            }
            curr.add(1);
            res.add(curr);
        }
        return res;
    }
}