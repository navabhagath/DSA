class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int ans=0,p1=0,p2=0;
        int n = players.length;
        int m = trainers.length;
        while(p1<n && p2<m){
            if(trainers[p2] >= players[p1]){
                ans++;
                p1++;
                p2++;
            }else{
                p2++;
            }
        }
        return ans;
    }
}