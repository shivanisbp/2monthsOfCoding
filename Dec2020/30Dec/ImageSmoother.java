/*
Problem Name: 661. Image Smoother
Problem Link: https://leetcode.com/problems/image-smoother/
*/
class Solution {
    public int[][] imageSmoother(int[][] M) {
        int m = M.length, n = M[0].length;
        int ans[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int sum = 0, cnt = 0;
                for(int ii = i-1;ii<=i+1;ii++){
                    for(int jj = j-1;jj<=j+1;jj++)
                        if(ii >= 0 && ii < m && jj >= 0 && jj < n){
                            sum += M[ii][jj];
                            cnt++;
                        }
                }
                ans[i][j] = sum/cnt;
            }
        }
        return ans;
    }
}
