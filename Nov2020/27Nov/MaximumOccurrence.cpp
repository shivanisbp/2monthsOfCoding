/*
Problem Name: Maximum occurrence
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/maximum-occurrence-9/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    string s;
    getline(cin,s);
    map<char,int> H;
    for(int i=0;i<s.length();++i)
            H[s[i]]++;

    char c;
    int num = 0;
    for(auto h: H){
        if(num < h.second){
            c = h.first;
            num = h.second;
        }
    }
    cout<<c<<" "<<num;
    return 0;
}
