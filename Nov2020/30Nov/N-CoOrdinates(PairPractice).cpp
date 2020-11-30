/*
Problem Name: N - Co Ordinates (Pair Practice)
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/n-co-ordinates-pair-practice/
*/

#include<bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int n,x,y;
    map<pair<int,int> ,int> m;
    cin>>n;
    for(int i=0;i<n;++i){
        cin>>x>>y;
        m[{x,y}]++;
    }

    for(auto l: m){
        cout<<l.first.first<<" "<<l.first.second<<" "<<l.second<<"\n";
    }
    return 0;
}
