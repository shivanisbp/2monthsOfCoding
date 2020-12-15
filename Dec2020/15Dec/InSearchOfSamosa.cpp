/*
Problem Name: In search of Samosa
Problem Link: https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/in-search-of-samosa-pledge-easy-3/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int n, k;
    cin>>n>>k;
    int S[n];
    for(int i=0;i<n;++i)
        cin>>S[i];
    sort(S,S+n);

    int samosas=0, sum=0, i=0;
    while(i<n){
        if(sum+S[i]<=k){
            sum += S[i];
            samosas++;
            i++;
        }
        else
            break;
    }
    cout<<samosas;
    return 0;
}
