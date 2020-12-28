/*
Problem Name: 908. Smallest Range I
Problem Link: https://leetcode.com/problems/smallest-range-i/
*/
class Solution {
    public int smallestRangeI(int[] A, int K) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int ele: A){
            min = Math.min(min,ele);
            max = Math.max(max,ele);
        }
        return Math.max(max - min - 2*K, 0);
    }
}
