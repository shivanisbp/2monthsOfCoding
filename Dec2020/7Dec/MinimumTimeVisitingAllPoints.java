/*
Problem Name: 1266. Minimum Time Visiting All Points
Problem Link: https://leetcode.com/problems/minimum-time-visiting-all-points/
*/
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0, n = points.length;
        for(int i=1;i<n;i++){
            time += Math.max(Math.abs(points[i][0]-points[i-1][0]),Math.abs(points[i][1]-points[i-1][1]));
        }
        return time;
    }
}
