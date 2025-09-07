class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        int limit = (int)Math.sqrt(bound);
        Set<Integer>hs = new HashSet<>();
        for(int i=0;i<=limit;i++){
            for(int j=0;j<=limit;j++){
                long a = (int)Math.pow(x,i);
                long b = (int)Math.pow(y,j);
                long sum = a+b;
                if(sum<=bound){
                    hs.add((int)sum);
                }
            }
        }
        List<Integer>ans = new ArrayList<>();
        for(int num : hs){
            ans.add(num);
        }
        return ans;
    }
}