/*
Problem name: 1252. Cells with Odd Values in a Matrix
Problem link: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
*/

class Solution {
public:
    int oddCells(int n, int m, vector<vector<int>>& indices) {
        int odd=0;
        vector<int> row(n,0);
        vector<int> col(m,0);
        for(int i=0;i<indices.size();++i){
            row[indices[i][0]]++;
            col[indices[i][1]]++;
        }
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                if((row[i] + col[j])%2 !=0)
                    odd++;
            }
        }
        return odd;
    }
};
