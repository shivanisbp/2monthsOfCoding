/*
Problem name: 1380. Lucky Numbers in a Matrix
Problem link: https://leetcode.com/problems/lucky-numbers-in-a-matrix/
*/

class Solution {
public:
    vector<int> luckyNumbers (vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        vector<int> row_min(m,INT_MAX),col_max(n,INT_MIN);
        
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                row_min[i] = min(row_min[i],matrix[i][j]);

        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                col_max[i] = max(col_max[i],matrix[j][i]);
        
        vector<int> res;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(row_min[i]==matrix[i][j] and col_max[j]==matrix[i][j])
                    res.push_back(matrix[i][j]);
        
        return res;
    }
};
