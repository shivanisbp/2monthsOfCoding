/*
Problem Name: All Vowels
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/all-vowels-2/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int n;
    cin>>n;
    char st[n];
    map<char, int> m;
    for(int i=0;i<n;++i){
        cin>>st[i];
        m[st[i]]++;
    }
    if(m['a'] > 0 && m['e'] > 0 && m['i'] > 0 && m['o'] > 0 && m['u'] > 0)
        cout<<"YES";
    else
        cout<<"NO";
    return 0;
}
