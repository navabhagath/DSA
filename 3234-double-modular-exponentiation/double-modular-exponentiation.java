class Solution {
    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer>ans=new ArrayList<>();
        int idx=0;
        for(int []a : variables){
            int ai=a[0],bi=a[1],ci=a[2],m=a[3];
            int n1 = 1;
            for(int i=0;i<bi;i++){
                n1 = (n1 * ai) % 10;
            }
            int n2 = 1;
            for(int i=0;i<ci;i++){
                n2 = (n2*n1)%m;
            }
            if(n2 == target){
                ans.add(idx);
            } 
            idx++;
        }
        return ans;
    }
}