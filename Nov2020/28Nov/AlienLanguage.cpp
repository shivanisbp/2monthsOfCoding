/*
Problem Name: Alien language
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/alien-language/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int t;
    cin>>t;
    while(t--){
        string t,p;
        bool ans=false;
        cin>>t;
        cin>>p;
        map<int,int> m;
        for(int i=0;i<t.length();++i){
            m[t[i]]++;
        }
        for(int i=0;i<p.length();++i){
            if(m[p[i]]>0){
                ans=true;
                break;
            }
        }
        if(ans) cout<<"YES\n";
        else    cout<<"NO\n";
    }
    return 0;
}
