/*
Problem Name: Star-studded Lockdown
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/star-studded-lockdown/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int t;
    cin>>t;
    while(t--){
        int n;
        long sum=0;
        cin>>n;
        string s;
        map<char,int> m;
        cin>>s;
        for(int i=0;i<s.length();++i){
            sum+=m[s[i]];
            m[s[i]]++;
        }
        cout<<sum<<"\n";
    }
    return 0;
}
