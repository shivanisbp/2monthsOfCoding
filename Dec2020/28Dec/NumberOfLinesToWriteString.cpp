/*
Problem name: 806. Number of Lines To Write String
Problem link: https://leetcode.com/problems/number-of-lines-to-write-string/
*/

class Solution {
public:
    vector<int> numberOfLines(vector<int>& widths, string s) {
        vector<int> result;
        int line=1, pixels=0, i=0;
        while(i<s.length()){
            if(pixels + widths[s[i]-97] <= 100){
                pixels += widths[s[i]-97];
                i++;
            }
            else{
                line++;
                pixels=0;
            }
        }
        result.push_back(line);
        result.push_back(pixels);
        return result;
    }
};
