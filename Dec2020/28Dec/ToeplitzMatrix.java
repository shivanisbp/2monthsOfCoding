/*
Problem Name: 766. Toeplitz Matrix
Problem Link: https://leetcode.com/problems/toeplitz-matrix/
*/
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for(int i=0;i<m;i++){
            int match = matrix[i][0];
            for(int j=i,k=0;j<m && k<n;j++,k++)
                if(matrix[j][k] != match)
                    return false;
        }
        for(int i=0;i<n;i++){
            int match = matrix[0][i];
            for(int j=0,k=i;j<m && k<n;j++,k++)
                if(matrix[j][k] != match)
                    return false;
        }
        return true;
    }
}
