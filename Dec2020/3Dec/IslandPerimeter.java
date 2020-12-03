/*
Problem Name: 463. Island Perimeter
Problem Link: https://leetcode.com/problems/island-perimeter/
*/
class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int cnt[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    if((i-1)>=0 && grid[i-1][j] == 0)
                        cnt[i][j]++;
                    if((i+1)<n && grid[i+1][j] == 0)
                        cnt[i][j]++;
                    if((j-1)>=0 && grid[i][j-1] == 0)
                        cnt[i][j]++;
                    if((j+1)<m && grid[i][j+1] == 0)
                        cnt[i][j]++;
                    if((i-1)<0)
                        cnt[i][j]++;
                    if((i+1)>=n)
                        cnt[i][j]++;
                    if((j-1)<0)
                        cnt[i][j]++;
                    if((j+1)>=m)
                        cnt[i][j]++;
                }
            }
        }
        int perimeter = 0;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                perimeter += cnt[i][j];
        return perimeter;
    }
}
