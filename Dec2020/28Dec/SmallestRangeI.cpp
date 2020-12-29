/*
Problem name: 908. Smallest Range I
Problem link: https://leetcode.com/problems/smallest-range-i/
*/

class Solution {
public:
    int smallestRangeI(vector<int>& A, int K) {
        int mi = *min_element(A.begin(), A.end());
        int ma = *max_element(A.begin(), A.end());
        return max(ma-mi-2*K,0);
    }
};
