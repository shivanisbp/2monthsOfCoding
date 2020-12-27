/*
Problem name: 999. Available Captures for Rook
Problem link: https://leetcode.com/problems/available-captures-for-rook/
*/

class Solution {
public:
    int numRookCaptures(vector<vector<char>>& board) {
        int x, y, captured=0;
        for(int i=0;i<8;++i){
            for(int j=0;j<8;++j ){
                if(board[i][j] == 'R'){
                    x=i;
                    y=j;
                    break;
                }
            }
        }
        
       for(int i=x-1;i>=0;--i){     //top
            if(board[i][y] == 'p'){
                captured++;
                break;
            }
            else if(board[i][y] == 'B')
                break; 
        } 
        
        for(int i=x+1;i<8;++i){      //bottom
            if(board[i][y] == 'p'){
                captured++;
                break;
            }
            else if(board[i][y] == 'B')
                break;
        }
        
        for(int i=y-1;i>=0;--i){        //left
            if(board[x][i] == 'p'){
                captured++;
                break;
            }
            else if(board[x][i] == 'B')
                break;
        } 
        
        for(int i=y+1;i<8;++i){      //right
            if(board[x][i] == 'p'){
                captured++;
                break;
            }
            else if(board[x][i] == 'B')
                break;
        }
        
        return captured;
    }
};
