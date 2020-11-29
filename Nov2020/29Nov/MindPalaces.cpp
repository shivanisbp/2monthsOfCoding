/*
Problem Name: Mind Palaces
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/mind-palaces-3/
*/

#include<bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int n,m,q;
    cin>>n>>m;
    int M[n][m];
    map<int,pair<int,int>> mp;
    for(int i=0;i<n;++i){
        for(int j=0;j<m;++j){
            cin>>M[i][j];
            mp[M[i][j]]={i,j};
        }
    }
    cin>>q;
    while(q--){
        int x;
        cin>>x;
        if(mp.find(x) != mp.end()){
            cout<<mp[x].first<<" "<<mp[x].second<<"\n";  
        }
        else{
            cout<<"-1 -1\n";
        }
    }
    return 0;
}
