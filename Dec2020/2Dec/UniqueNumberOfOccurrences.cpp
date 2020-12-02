/*
Problem name: 1207. Unique Number of Occurrences
Problem link: https://leetcode.com/problems/unique-number-of-occurrences/
*/

class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        map<int,int> m;
        set<int> s;
        bool ans = true;
        for(int i=0;i<arr.size();++i){
            m[arr[i]]++;
        }
        for( auto l:m){
            if(s.find(l.second) == s.end()){
                s.insert(l.second);
            }
            else{
                ans = false;
                break;
            }
        }
        return ans;
    }
};
