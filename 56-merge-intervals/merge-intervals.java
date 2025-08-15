class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        int n = intervals.length;
        List<int []>res = new ArrayList<>();
        int []temp = intervals[0];
        res.add(temp);
        for(int []interval : intervals){
            if(interval[0] <= temp[1]){
                temp[1] = Math.max(interval[1] , temp[1]);
            }else{
                temp = interval;
                res.add(temp);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}