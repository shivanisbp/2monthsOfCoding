/*
Problem Name: Micro and Array Update
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/micro-and-array-update/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
        int n,k,minv=INT_MAX;
        cin>>n>>k;
        int A[n];
        for(int i=0;i<n;++i){
            cin>>A[i];
            minv=min(minv,A[i]);
        }
        if(k>minv)   cout<<k-minv<<endl;
        else    cout<<"0"<<endl;
        
    }
    return 0;
}
