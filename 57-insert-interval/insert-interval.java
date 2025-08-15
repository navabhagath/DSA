class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]>res = new ArrayList<>();
        for(int []x : intervals){
            res.add(x);
        }
        int n = intervals.length;
        res.add(newInterval);
        Collections.sort(res, (a,b) -> Integer.compare(a[0] , b[0]) );
        List<Pair>ans = new ArrayList<>();
        int []current = res.get(0);
        ans.add(new Pair(current[0] , current[1]));
        for(int i=1;i<n+1;i++){
            int curf = res.get(i)[0];
            int curs = res.get(i)[1];
            int f = ans.get(ans.size()-1).f;
            int s = ans.get(ans.size()-1).s;
            if(curf <= s){
                ans.remove(ans.size()-1);
                ans.add(new Pair(f,Math.max(s,curs)));
            }else{
                ans.add(new Pair(curf,curs));
            }
        }
        for(Pair z : ans){
            System.out.println(z.f +" "+z.s);
        }
        int [][]result = new int[ans.size()][2];
        int ind = 0;
        for(Pair z : ans){
            result[ind][0] = z.f;
            result[ind][1] = z.s;
            ind++;
        }
        return result;
    }
}
class Pair{
    int f;
    int s;
    Pair(int f,int s){
        this.f = f;
        this.s = s;
    }
}