class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer>al=new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(i+1);
        }
        Collections.sort(al,(a,b)->String.valueOf(a).compareTo(String.valueOf(b)));

        return al;
    }
}