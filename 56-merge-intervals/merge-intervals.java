class Solution {

    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<Pair>res = new ArrayList<>();
        res.add(new Pair(intervals[0][0] , intervals[0][1]));
        for(int i=1;i<n;i++){
            Pair x = res.get(res.size()-1);
            int f = x.first;
            int s = x.second;
            int curf = intervals[i][0];
            int curs = intervals[i][1];
            if(curf <= s){
                res.remove(res.get(res.size()-1));
                res.add(new Pair(f,Math.max(s,curs)));
            }else{
                res.add(new Pair(curf,curs));
            }
        }
        int [][]ans = new int[res.size()][2];
        int idx = 0;
        for(Pair y : res){
            ans[idx][0] = y.first;
            ans[idx][1] = y.second;
            idx++;
        } 
        return ans;
    }
}
class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}