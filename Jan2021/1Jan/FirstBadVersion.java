/*
Problem Name: 278. First Bad Version
Problem Link: https://leetcode.com/problems/first-bad-version/
*/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 0, r = n, ans = -1;
        for(;l<=r;){
            int mid = l + (r-l)/2;
            if(isBadVersion(mid)){
                r = mid - 1;
                ans = mid;
            }
            else{
                l = mid + 1;
            }
        }
        return ans;
    }
}
