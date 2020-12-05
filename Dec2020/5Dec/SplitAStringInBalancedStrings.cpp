/*
Problem name: 1221. Split a String in Balanced Strings
Problem link: https://leetcode.com/problems/split-a-string-in-balanced-strings/
*/

class Solution {
public:
    int balancedStringSplit(string s) {
        int arr[s.length()];
        int count = 0;
        for(int i=0;i<s.length();++i){
            if(s[i] == 'R')
                arr[i] = 1;
            else
                arr[i]=-1;
        }
        for(int i=1;i<s.length();++i){
            arr[i]+=arr[i-1];
            if(arr[i] == 0)
                count++;
        }
        return count;
    }
};
