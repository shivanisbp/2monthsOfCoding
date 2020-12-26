/*
Problem Name: 1380. Lucky Numbers in a Matrix
Problem Link: https://leetcode.com/problems/lucky-numbers-in-a-matrix/
*/
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int row[] = new int[n], col[] = new int[m];
        for(int i=0;i<n;i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<m;j++){
                min = Math.min(min,matrix[i][j]);
            }
            row[i] = min;
        }
        for(int i=0;i<m;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                max = Math.max(max,matrix[j][i]);
            }
            col[i] = max;
        }
        List<Integer> lucky = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i] == col[j])
                    lucky.add(row[i]);
            }
        }
        return lucky;
    }
}
