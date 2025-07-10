class Solution {
    public int maxFreeTime(int ev, int[] s, int[] e) {
        int n = s.length;
        if(n==0) return ev;

        int []gap = new int[n+1];
        gap[0] = s[0];
        for(int i=1;i<n;i++){
            gap[i] = s[i] - e[i-1];
        }
        gap[n] = ev-e[n-1];
        int []right = new int[n+1];
        for(int i=n-1;i>=0;i--){
            right[i] = Math.max(right[i+1],gap[i+1]);
        }
        int free=0,left=0;
        for(int i=1;i<=n;i++){
            int time = e[i-1] - s[i-1];
            boolean b1 = left >= time;
            boolean b2 = right[i] >= time;

            if(b1 || b2){
                free = Math.max(free,gap[i-1]+gap[i]+time);
            }
            free = Math.max(free,gap[i-1]+gap[i]);
            left = Math.max(left,gap[i-1]);
        }
        return free;
    }
}