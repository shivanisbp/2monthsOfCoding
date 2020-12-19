/*
Problem Name: Easy Going.(Very Easy)
Problem Link: https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/min-max-difference/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    test(t){
        int n, m;
        cin>>n>>m;
        int A[n], max=0, min=0;
        for(int i=0;i<n;++i)
            cin>>A[i];
        
        sort(A,A+n);
        for(int i=0;i<n;++i){
            if(i >= m)
                max+=A[i]; 
            if(i < n-m)
                min+=A[i];
        }
        cout<<max-min<<"\n";
    }
    return 0;
}
