class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]>inter = new ArrayList<>(Arrays.asList(intervals));
        inter.add(newInterval);
        int n = inter.size();
        Collections.sort(inter, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]>res = new ArrayList<>();
        int []curr = inter.get(0);
        for(int i=0;i<n;i++){
            int []interval = inter.get(i);
            if(interval[0] <= curr[1]){
                curr[1] = Math.max(curr[1] , interval[1]);
            }else{
                res.add(curr);
                curr = interval;
            }
        }
        res.add(curr);
        return res.toArray(new int[res.size()][]);
        
    }
}
