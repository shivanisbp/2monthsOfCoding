/*
Problem Name: Policemen and thieves
Problem Link: https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/joker-and-thieves-53e59f4a/description/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    test(t){
        int n, k, caught = 0;
        cin>>n>>k;
        char A[n][n];
        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                cin>>A[i][j];
            }
        }
        for(int i=0; i<n; ++i){
            vector<int> police;
            vector<int> thief;
            for(int j=0; j<n; ++j){
                if(A[i][j] == 'P')
                    police.push_back(j);
                else
                    thief.push_back(j);
            }
            int p = 0, t = 0;
            while(p < police.size() && t < thief.size()){
                if(abs(police[p] - thief[t]) <= k){
                    p++;
                    t++;
                    caught++;
                }
                else if(police[p] < thief[t])
                    p++;
                else
                    t++;
            }
            police.clear();
            thief.clear();
        }
        cout<<caught<<"\n";
    }
    return 0;
}
