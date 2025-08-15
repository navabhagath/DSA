class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0] , b[0]));
        List<int []>res = new ArrayList<>();
        for(int []x : intervals){
            if(res.size() == 0 || x[0] > res.get(res.size()-1)[1]){
                res.add(new int[] {x[0] , x[1] });
            }else{
                int []temp = res.get(res.size()-1);
                temp[1] = Math.max(temp[1] , x[1]);
                res.remove(res.size()-1);
                res.add(new int []{temp[0] , temp[1]});
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}