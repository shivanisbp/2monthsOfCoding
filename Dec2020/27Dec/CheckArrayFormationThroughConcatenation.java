/*
Problem Name: 1640. Check Array Formation Through Concatenation
Problem Link: https://leetcode.com/problems/check-array-formation-through-concatenation/
*/
class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        boolean possible = true;
        int n = arr.length, slen = pieces.length;
        for(int i=0;i<n;i++){
            int ind = -1;
            for(int j=0;j<slen;j++){
                if(arr[i] == pieces[j][0]){
                    ind = j;
                    break;
                }
            }
            if(ind == -1){
                possible = false;
                break;
            }
            for(int j=0;j<pieces[ind].length;j++,i++){
                if(arr[i] != pieces[ind][j]){
                    possible = false;
                    break;
                }
            }
            i--;
            if(!possible)
                break;
        }
        return possible;
    }
}
