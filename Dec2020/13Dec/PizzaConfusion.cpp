/*
Problem Name: Pizza Confusion
Problem Link: https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/pizza-confusion/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)
#define ll          long long

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    ll n, points, maxpoints;
    string name, rest;
    map<int, vector<string>> m;
    cin>>n;
    cin>>name>>points;
    maxpoints = points;
    rest = name;
    for(ll i=1;i<n;++i){
        cin>>name>>points;
        if(points == maxpoints){
            if(name < rest){
                rest = name;
            }
        }
        else if(points > maxpoints){
            rest = name;
            maxpoints = points;
        }
    }
    cout<<rest;
    return 0;
}
