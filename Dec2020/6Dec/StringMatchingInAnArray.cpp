/*
Problem name: 1408. String Matching in an Array
Problem link: https://leetcode.com/problems/string-matching-in-an-array/
*/

class Solution {
public:
    vector<string> stringMatching(vector<string>& words) {
        vector<string> res;
        
        for(int i=0;i<words.size();++i){
            for(int j=0;j<words.size();++j){
                if(i!=j && words[i].size() <= words[j].size()){
                    if(words[j].find(words[i]) != -1){
                        res.push_back(words[i]);
                        break;
                    }
                }
            }
        }
        return res;
    }
};
