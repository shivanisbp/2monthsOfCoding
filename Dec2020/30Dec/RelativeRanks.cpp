/*
Problem name: 506. Relative Ranks
Problem link: https://leetcode.com/problems/relative-ranks/
*/

class Solution {
public:
    vector<string> findRelativeRanks(vector<int>& nums) {
        map<int,int> m;
        vector<string> res (nums.size(),"");
        for(int i=0;i<nums.size();++i){
            m[nums[i]]=i;
        }
        int cnt=0;
        for(auto i=m.rbegin(); i!=m.rend(); ++i){
            cnt++;
            if(cnt == 1)
                res[i->second]="Gold Medal";
            else if(cnt == 2)
                res[i->second]="Silver Medal";
            else if(cnt == 3)
                res[i->second]="Bronze Medal";
            else
                res[i->second]=to_string(cnt);
        }
        return res;
    }
};
