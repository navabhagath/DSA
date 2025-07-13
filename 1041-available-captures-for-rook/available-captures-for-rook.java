class Solution {
    public int numRookCaptures(char[][] board) {
        int ans = 0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j] == 'R'){
                    ans+=left(board,i,j);
                    ans+=right(board,i,j);
                    ans+=up(board,i,j);
                    ans+=down(board,i,j);
                    i=8;
                    j=8;
                }
            }
        }
        return ans;
    }
    public int left(char[][] arr,int i,int j){
        if(j<0 || arr[i][j] == 'B') return 0;
        if(arr[i][j] == 'p') return 1;
        return left(arr,i,j-1);
    }
    public int right(char[][] arr,int i,int j){
        if(j>=8 || arr[i][j] == 'B') return 0;
        if(arr[i][j] == 'p') return 1;
        return right(arr,i,j+1);
    }
    public int up(char[][] arr,int i,int j){
        if(i<0 || arr[i][j] == 'B') return 0;
        if(arr[i][j] == 'p') return 1;
        return up(arr,i-1,j);
    }
    public int down(char[][] arr,int i,int j){
        if(i>=8 || arr[i][j] == 'B') return 0;
        if(arr[i][j] == 'p') return 1;
        return down(arr,i+1,j);
    }
}