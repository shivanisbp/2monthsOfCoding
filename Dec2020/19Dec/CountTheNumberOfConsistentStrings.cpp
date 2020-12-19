/*
Problem name: 1684. Count the Number of Consistent Strings
Problem link: https://leetcode.com/problems/count-the-number-of-consistent-strings/
*/

class Solution {
public:
    int countConsistentStrings(string allowed, vector<string>& words) {
        set<char> a;
        for(int i=0;i<allowed.length();++i)
            a.insert(allowed[i]);
        
        int count=0, flag;
        for(int i=0;i<words.size();++i){
            flag=0;
            for(int j=0;j<words[i].size();++j){
                if(!a.count(words[i][j])){
                    flag=1;
                    break;
                }
            }
            if(!flag)  count++;
        }
        return count;
    }
};
