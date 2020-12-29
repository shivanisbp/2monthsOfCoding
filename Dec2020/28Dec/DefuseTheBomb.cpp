/*
Problem name: 1652. Defuse the Bomb
Problem link: https://leetcode.com/problems/defuse-the-bomb/
*/

class Solution {
public:
    vector<int> decrypt(vector<int>& code, int k) {

        vector<int>copy = code;
        int sum, n = code.size();
        
        if(k<0){
            k=-1*k;
            for(int i=0;i<n;++i){
                sum=0;
                for(int j=1;j<=k;++j){
                    if(i-j<0)
                        sum += copy[n+(i-j)];
                    else
                        sum += copy[i-j];
                }
                code[i]=sum;
            }
        }
        
        else if(k>0){
            for(int i=0;i<n;++i){
                sum=0;
                for(int j=1;j<=k;++j){
                    sum += copy[(i+j)%n];
                }
                code[i]=sum;
            }
        }
        
        else{
            for(int i=0;i<n;++i){
                code[i]=0;
            }
        }
        return code;
    }
};
