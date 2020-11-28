/*
Problem Name: Frequency of Students
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/frequency-of-students/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int n;
    cin>>n;
    string s[n];
    map<string,int> m;
    for(int i=0;i<n;++i){
        cin>>s[i];
        m[s[i]]++;
    }
    sort(s,s+n);
    for(int i=0;i<n;++i){
        if(m[s[i]]>0)
            cout<<s[i]<<" "<<m[s[i]]<<"\n";
            m[s[i]]=-1;
    }
    return 0;
}
