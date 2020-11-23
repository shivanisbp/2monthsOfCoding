/*
Problem Name: 986. Interval List Intersections
Problem Link: https://leetcode.com/problems/interval-list-intersections/
*/
class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int a = 0, b = 0;
        List<int[]> l = new ArrayList<int[]>();
        for(;a<A.length && b<B.length;){
            if(A[a][1] < B[b][0])
                a++;
            else if(A[a][0] > B[b][1])
                b++;
            else{
                l.add(new int[]{Math.max(A[a][0],B[b][0]), Math.min(A[a][1],B[b][1])});
                if(A[a][1] < B[b][1])
                    a++;
                else if(A[a][1] > B[b][1])
                    b++;
                else{
                    a++;
                    b++;
                }
            }
        }
        int[][] ans = new int[l.size()][];
        for(int i=0;i<l.size();i++){
            ans[i] = l.get(i);
        }
        return ans;
    }
}
