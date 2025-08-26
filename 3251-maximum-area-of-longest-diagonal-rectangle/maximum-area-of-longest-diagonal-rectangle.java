class Pair{
    int first;
    double second;
    Pair(int first,double second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        List<Pair>al = new ArrayList<>();
        for(int []x : dimensions){
            int l = x[0];
            int b = x[1];
            int area = l * b;
            double diag = Math.sqrt(l*l + b*b);
            al.add(new Pair(area,diag));
        }
        Collections.sort(al,(a,b)->{
            if(a.second == b.second){
                return Integer.compare(b.first,a.first);
            }
            return Double.compare(b.second,a.second);
        });
        int ans = al.get(0).first;
        return ans;
    }
}