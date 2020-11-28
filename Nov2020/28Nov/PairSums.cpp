/*
Problem Name: Pair Sums
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/pair-sums/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int n,k;
    cin>>n>>k;
    int A[n];
    for(int i=0;i<n;++i)
        cin>>A[i];

    sort(A,A+n);
    bool ans=false;
    int f=0,l=n-1;
    while(f < l){
        if(A[f] + A[l] < k)
            f++;
        else if(A[f] + A[l] > k)
            l--;
        else{
            ans=true;
            break;
        }
    }
    if(ans) cout<<"YES";
    else    cout<<"NO";
    return 0;
}
