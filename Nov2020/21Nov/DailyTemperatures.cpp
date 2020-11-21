/*
Problem name: Daily Temperatures
Problem link: https://leetcode.com/problems/daily-temperatures/
*/

class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& T) {
        vector<int> days(T.size(),0);
        stack<int> s;
        for(int i=0;i<T.size();++i){
            while(!s.empty() && T[s.top()]<T[i]){
                days[s.top()]=i-s.top();
                s.pop();
            }
            s.push(i);
        }
        return days;
    }
};
