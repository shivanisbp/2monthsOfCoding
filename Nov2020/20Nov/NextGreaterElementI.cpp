/*
Problem name: Next Greater Element I
Problem link: https://leetcode.com/problems/next-greater-element-i/
*/

class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        vector<int> ans;
        map<int,int> m;
        int key,val;
        
        for(int i=0;i<nums2.size();++i){
            key=nums2[i],val=-1;
            for(int j=i+1;j<nums2.size();++j){
                if(nums2[j]>key){
                    val=nums2[j];
                    break;
                }
            }
            m[key]=val;
        }
        
        for(int i=0;i<nums1.size();++i){
            ans.push_back(m[nums1[i]]);
        }
        
        return ans;
    }
};
