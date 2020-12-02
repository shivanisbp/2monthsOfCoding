/*
Problem name: 1002. Find Common Characters
Problem link: https://leetcode.com/problems/find-common-characters/
*/

class Solution {
public:
    vector<string> commonChars(vector<string>& A) {
        vector<string> ans;
        int arr[26]={0},count;
        for(int i=0;i<A[0].size();++i){
            arr[A[0][i]-'a']++;
        }
        for(int i=1;i<A.size();++i){
            int temp[26]={0};
            for(int j=0;j<A[i].size();++j){
                temp[A[i][j]-'a']++;
            }
            for(int j=0;j<26;++j){
                arr[j]=min(arr[j],temp[j]);
            }
        }
        for(int i=0;i<26;++i){
            if(arr[i]>0){
                count=arr[i];
                string s;
                s=char(i+97);
                while(count--){
                    ans.push_back(s);
                }
            }
        }
        return ans;
    }
};
