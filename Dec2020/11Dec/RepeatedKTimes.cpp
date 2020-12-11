/*
Problem Name: Repeated K Times
Problem Link: https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/repeated-k-times/
*/

#include<bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int n,k;
    cin>>n;
    int A[n];
    map<int,int> m;
    for(int i=0;i<n;++i){
        cin>>A[i];
        m[A[i]]++;
    }
    cin>>k;
    for(auto l: m){
        if(l.second == k){
            cout<<l.first;
            break;
        }
    }
    return 0;
}
