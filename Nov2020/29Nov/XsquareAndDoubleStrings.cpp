/*
Problem Name: Xsquare And Double Strings
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/xsquare-and-double-strings-1/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)   int t; cin>>t; while(t--)

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    test(t){
        string s;
        cin>>s;
        map<char,int> m;
        bool ans = false;
        for(int i=0;i<s.length();++i){
            m[s[i]]++;
            if(m[s[i]]==2){
                ans=true;
                break;
            }
        }
        if(ans) cout<<"Yes\n";
        else    cout<<"No\n";
    }
    return 0;
}
