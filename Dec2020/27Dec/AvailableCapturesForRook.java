/*
Problem Name: 999. Available Captures for Rook
Problem Link: https://leetcode.com/problems/available-captures-for-rook/
*/
class Solution {
    public int numRookCaptures(char[][] board) {
        int rr = -1, rc = -1;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j] == 'R'){
                    rr = i;
                    rc = j;
                    break;
                }
            }
            if(rr != -1)
                break;
        }
        int pawns = 0;
        for(int i=rc-1;i>=0;i--){
            if(board[rr][i] == 'p'){ pawns++; break; }
            else if(board[rr][i] == 'B'){ break; }
        }
        for(int i=rr-1;i>=0;i--){
            if(board[i][rc] == 'p'){ pawns++;break; }
            else if(board[i][rc] == 'B'){ break; }
        }
        for(int i=rc+1;i<8;i++){
            if(board[rr][i] == 'p'){ pawns++; break; }
            else if(board[rr][i] == 'B'){ break; }
        }
        for(int i=rr+1;i<8;i++){
            if(board[i][rc] == 'p'){ pawns++;break; }
            else if(board[i][rc] == 'B'){ break; }
        }
        return pawns;
    }
}
