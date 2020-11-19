/*
Problem name: Number of Students Doing Homework at a Given Time
Problem link: https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/
*/

class Solution {
public:
    int busyStudent(vector<int>& startTime, vector<int>& endTime, int queryTime) {
        int ts=startTime.size(),s=0;
        
        for(int i=0;i<ts;++i){
            if(queryTime>=startTime[i] && queryTime<=endTime[i]){
                s++;
            }
        }
        return s;
    }
};
