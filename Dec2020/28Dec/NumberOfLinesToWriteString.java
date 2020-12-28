/*
Problem Name: 806. Number of Lines To Write String
Problem Link: https://leetcode.com/problems/number-of-lines-to-write-string/
*/
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1, width = 0;
        char c[] = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(width + widths[c[i]-'a'] <= 100)
                width += widths[c[i]-'a'];
            else{
                lines++;
                width = 0;
                i--;
            }
        }
        return new int[]{lines,width};
    }
}
