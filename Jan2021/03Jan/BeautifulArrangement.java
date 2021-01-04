/*
Problem Name: 526. Beautiful Arrangement
Problem Link: https://leetcode.com/problems/beautiful-arrangement/
*/
class Solution {
    int arrangements;
    public int countArrangement(int n) {
        boolean visited[] = new boolean[n+1];
        arrangements = 0;
        generate(1, visited);
        return arrangements;
    }
    void generate(int curInd, boolean v[]){
        if(curInd == v.length){
            arrangements++;
            return;
        }
        int n = v.length;
        for(int i=1;i<n;i++){
            if(!v[i] && ((i%curInd == 0) || (curInd%i == 0))){
                v[i] = true;
                generate(curInd + 1, v);
                v[i] = false;
            }
        }
    }
}
