/*
Problem Name: C.Sort it out!
Problem Link: https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/sort-it-out/
*/

#include<bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int m;
    cin>>m;
    int A;
    map<int, vector<int>> mp;
    for(long i=0;i<m;++i){
        cin>>A;
        vector<int> v = mp[A];
        v.push_back(i);
        mp[A]=v;
    }
    for(auto l: mp){
        for(int i =0;i<l.second.size();++i){
            cout<<l.second[i]<<" ";
        }
    }    
    return 0;
}
