/*
Problem name: 986. Interval List Intersections
Problem link: https://leetcode.com/problems/interval-list-intersections/
*/

class Solution {
public:
    vector<vector<int>> intervalIntersection(vector<vector<int>>& A, vector<vector<int>>& B) {
        vector<vector<int>> common;
        int i=0,j=0,x,y;
        
        while( i<A.size() && j<B.size() ){
            x = max(A[i][0], B[j][0]);
            y = min(A[i][1], B[j][1]);
            
            if(x <= y)
                common.push_back({x,y});
            
            if(y == A[i][1]) i++;
            if(y == B[j][1]) j++;
        }
        return common;
    }
};
