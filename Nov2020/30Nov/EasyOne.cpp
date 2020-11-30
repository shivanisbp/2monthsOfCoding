/*
Problem Name: Easy one
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/easy-one-8/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    test(t){
        int n,q,val;
        cin>>n>>q;
        map<int,int> m;
        for(int i=0;i<n;++i){
            cin>>val;
            m[val]++;
        }
        for(int i=0;i<q;++i){
            cin>>val;
            cout<<m[val]<<"\n";
        }
    }
    return 0;
}
