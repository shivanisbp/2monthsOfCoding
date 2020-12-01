/*
Problem Name: Statistics
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/statistics-2/
*/

#include<bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int n;
    cin>>n;
    set<string>  names;
    map<string, int> sport;
    string key, val, ans;
    int max=-1;

    for(int i=0;i<n;++i){
        cin>>key>>val;
        if(names.find(key) == names.end()){
            names.insert(key);
            sport[val]++;
        }
    }
    for(auto l: sport){
        if(l.second > max){
            ans = l.first;
            max = l.second;
        }
    }
    
    cout<<ans<<"\n"<<sport["football"];
    return 0;
}
