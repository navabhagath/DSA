class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String>al=new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(String.valueOf(i+1));
        }
        //Collections.sort(al,(a,b)->String.valueOf(a).compareTo(String.valueOf(b)));
        Collections.sort(al);
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(Integer.parseInt(al.get(i)));
        }
        return ans;
    }
}