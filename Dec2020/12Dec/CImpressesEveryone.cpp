/*
Problem Name: C impresses everyone
Problem Link: https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/c-impresses-everyone/
*/

#include<bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int n, y, q, sum = 0;
    cin>>n;
    vector<int> a(n+1,0);
    for(int i=1; i<=n; ++i){
        cin>>a[i];
        a[i] += a[i-1];
    }
    cin>>q;
    while(q--){
        cin>>y;
        int i = a[n] - y + 1;
        i = lower_bound(a.begin(),a.end(), i) - a.begin();
        (i&1) ? cout<<"A\n" : cout<<"B\n";
    }
    return 0;
}
