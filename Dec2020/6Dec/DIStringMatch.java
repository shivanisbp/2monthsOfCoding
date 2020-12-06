/*
Problem Name: 942. DI String Match
Problem Link: https://leetcode.com/problems/di-string-match/
*/
class Solution {
    public int[] diStringMatch(String S) {
        int ans[] = new int[S.length()+1];
        int inc = 0, dec = S.length();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == 'I')
                ans[i] = inc++;
            else
                ans[i] = dec--;
        }
        ans[ans.length-1] = inc;
        return ans;
    }
}
