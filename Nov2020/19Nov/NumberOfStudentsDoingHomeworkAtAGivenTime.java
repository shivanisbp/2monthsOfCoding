/*
Problem Name: 1450. Number of Students Doing Homework at a Given Time
Problem Link: https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/
*/
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int cnt = 0;
        int n = startTime.length;
        for(int i=0;i<n;i++){
            if((queryTime >= startTime[i]) && (queryTime <= endTime[i]))
                cnt++;
        }
        return cnt;
    }
}
