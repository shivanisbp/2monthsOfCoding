/*
Problem Name: 985. Sum of Even Numbers After Queries
Problem Link: https://leetcode.com/problems/sum-of-even-numbers-after-queries/
*/
class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sum = 0, n = A.length;
        for(int i=0;i<n;i++)
            if(A[i]%2 == 0)
                sum += A[i];
        n = queries.length;
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            int delta = queries[i][0], index = queries[i][1];
            if(A[index]%2 == 0)
                sum -= A[index];
            A[index] += delta;
            if(A[index]%2 == 0)
                sum += A[index];
            ans[i] = sum;
        }
        return ans;
    }
}
