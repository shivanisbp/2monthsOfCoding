/*
Problem Name: 1221. Split a String in Balanced Strings
Problem Link: https://leetcode.com/problems/split-a-string-in-balanced-strings/
*/
class Solution {
    public int balancedStringSplit(String s) {
        int cnt = 0, balance = 0;
        for(char c: s.toCharArray()){
            switch(c){
                case 'R': balance++;break;
                case 'L': balance--;break;
            }
            if(balance == 0)
                cnt++;
        }
        return cnt;
    }
}
