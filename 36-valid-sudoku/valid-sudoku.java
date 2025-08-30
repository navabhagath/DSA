class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                Set<Character>hs = new HashSet<>();
                for(int x=0;x<3;x++){
                    for(int y=0;y<3;y++){
                        char ch = board[i+x][j+y];
                        if(ch == '.') continue;
                        if(hs.contains(ch)){
                            return false;
                        }else{
                            hs.add(ch);
                        }
                    }
                }
            }
        }
        for(int i=0;i<9;i++){
            Set<Character>hs = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j] == '.') continue;
                if(hs.contains(board[i][j])) return false;
                else hs.add(board[i][j]);
            }
        }
        for(int i=0;i<9;i++){
            Set<Character>hs = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i] == '.') continue;
                if(hs.contains(board[j][i])) return false;
                else hs.add(board[j][i]);
            }
        }
        return true;
    }
}