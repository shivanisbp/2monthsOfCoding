/*
Problem Name: The Best Player
Problem Link: https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/the-best-player-1/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)
#define ll          long long

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    ll n, t, fq;
    string name;
    cin>>n>>t;
    map<int, vector<string>, std::greater<int>> m;
    for(ll i=0;i<n;++i){
        cin>>name>>fq;
        vector<string>temp = m[fq];
        temp.push_back(name);
        m[fq] = temp;
    }
    
    int i=0;
    for(auto l: m){
        sort(l.second.begin(),l.second.end());
        for(int j=0;j<l.second.size();++j){
            if(i<t){
                cout<<l.second[j]<<"\n";
                i++;
            }
            else
                break;
        }
    }
    return 0;
}
