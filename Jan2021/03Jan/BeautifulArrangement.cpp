/*
Problem name: 526. Beautiful Arrangement
Problem link: https://leetcode.com/problems/beautiful-arrangement/
*/

class Solution {
public:
    int ans=0;
    int countArrangement(int n) {
        vector<bool> visited(n);
        helper(visited, n);
        return ans;
    }
    void helper(vector<bool>& visited, int end, int pos = 1){
        if(pos == end+1){
            ans++;
            return;
        }
        for(int i=1; i<=end; ++i){
            if(!visited[i] && (i%pos==0 || pos%i==0)){
                visited[i]=true;
                helper(visited, end, pos+1 );
                visited[i]=false;
            }
        }
    }
};
