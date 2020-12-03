/*
Problem name: 599. Minimum Index Sum of Two Lists
Problem link: https://leetcode.com/problems/minimum-index-sum-of-two-lists/
*/

class Solution {
public:
    vector<string> findRestaurant(vector<string>& list1, vector<string>& list2) {
        map<string, int> l1;
        int minv=INT_MAX,indexsum;
        vector<string> ans;
        
        for(int i=0;i<list1.size();++i)
            l1[list1[i]]=i;
        
        for(int i=0;i<list2.size();++i){
            if(l1.find(list2[i]) != l1.end()){
                
                indexsum = l1[list2[i]] + i;
                
                if(indexsum < minv)
                    ans.clear();
                
                if(indexsum <= minv){
                    minv = indexsum;
                    ans.push_back(list2[i]);
                }
            }
        }
        return ans;
    }
};
