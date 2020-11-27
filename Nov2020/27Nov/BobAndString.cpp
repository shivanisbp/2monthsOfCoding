/*
Problem Name: Bob and String
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/bob-and-string-easy/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int t;
    cin>>t;
    while(t--){
        string s,t;
        cin>>s>>t;
        int s1[26]={0}, t1[26]={0};
        for(int i=0;i<s.length();++i)
            s1[int(s[i])-'a']++;
        
        for(int i=0;i<t.length();++i)
            t1[int(t[i])-'a']++;
        
        int op=0;
        for(int i=0;i<26;++i){
            op+=abs(s1[i]-t1[i]);
        }
        cout<<op<<"\n";
    }
    return 0;
}
