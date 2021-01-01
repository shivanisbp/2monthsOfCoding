/*
Problem name: 278. First Bad Version
Problem link: https://leetcode.com/problems/first-bad-version/
*/

// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        int l=1,r=n;
        int m, ans;
        while(l<=r){
            m=l+(r-l)/2;
            if(isBadVersion(m)){
                r=m-1;
                ans=m;
            }
            else
                l=m+1;
        }
        return ans;
    }
};
