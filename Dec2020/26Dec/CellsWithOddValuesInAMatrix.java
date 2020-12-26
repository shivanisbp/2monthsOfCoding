/*
Problem Name: 1252. Cells with Odd Values in a Matrix
Problem Link: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
*/
class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int row[] = new int[n], col[] = new int[m];
        for(int i=0;i<indices.length;i++){
            row[indices[i][0]]++;
            col[indices[i][1]]++;
        }
        int oddcells = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((row[i] + col[j])%2 == 1)
                    oddcells++;
            }
        }
        return oddcells;
    }
}
