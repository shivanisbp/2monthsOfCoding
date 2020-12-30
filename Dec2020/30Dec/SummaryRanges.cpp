/*
Problem name: 228. Summary Ranges
Problem link: https://leetcode.com/problems/summary-ranges/
*/

class Solution {
public:
    vector<string> summaryRanges(vector<int>& nums) {
        vector<string> result;
        int len=nums.size();
        for(int i=0;i<len;++i){
            int first=nums[i], flag=0;
            while(i+1 < len && nums[i]+1 == nums[i+1]){
                    i++;
                    flag=1;
            } 
            string temp="";
            if(flag == 1){                           
                temp = temp + to_string(first)+"->"+ to_string(nums[i]);
            }
            else{
                temp = temp + to_string(first);
            }
            result.push_back(temp);
        }
        return result;
    }
};
