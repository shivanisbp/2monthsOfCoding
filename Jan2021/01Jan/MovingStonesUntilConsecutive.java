/*
Problem Name: 1033. Moving Stones Until Consecutive
Problem Link: https://leetcode.com/problems/moving-stones-until-consecutive/
*/
class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int arr[] = {a,b,c};
        Arrays.sort(arr);
        int ans[] = {0, arr[2] - arr[0] - 2};
        if(arr[1] - arr[0] == 2)
            ans[0] = 1;
        else if(arr[2] - arr[1] == 2)
            ans[0] = 1;
        else{
            if(arr[1] - arr[0] > 2)
                ans[0]++;
            if(arr[2] - arr[1] > 2)
                ans[0]++;
        }
        return ans;
    }
}
