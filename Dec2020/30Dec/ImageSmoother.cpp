/*
Problem name: 661. Image Smoother
Problem link: https://leetcode.com/problems/image-smoother/
*/

class Solution {
public:
    vector<vector<int>> imageSmoother(vector<vector<int>>& M) {
        vector<vector<int>> result;
        vector<int> temp;
        int sum,num;
        for(int i=0;i<M.size();++i){
            for(int j=0;j<M[i].size();++j){
                if(i>0){
                    sum+=M[i-1][j];
                    num++;
                }
                if(j>0){
                    sum+=M[i][j-1];
                    num++;
                }
                if(i>0 && j>0){
                    sum+=M[i-1][j-1];
                    num++;
                }
                if(i>0 && j<M[i].size()-1){
                    sum+=M[i-1][j+1];
                    num++;
                }
                if(j<M[i].size()-1){
                    sum+=M[i][j+1];
                    num++;
                }
                if(i<M.size()-1 && j<M[i].size()-1){
                    sum+=M[i+1][j+1];
                    num++;
                }
                if(i<M.size()-1){
                    sum+=M[i+1][j];
                    num++;
                }
                if(i<M.size()-1 && j>0){
                    sum+=M[i+1][j-1];
                    num++;
                }
                sum+=M[i][j];
                num++;
                temp.push_back(sum/num);
                sum=0;
                num=0;
            }
            result.push_back(temp);
            temp.clear();
        }
        return result;
    }
};
