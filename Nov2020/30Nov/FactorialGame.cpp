/*
Problem Name: Factorial Game
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/factorial-game-1/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);       
    long int fact[100001]={1}, mod = 1000000007; 
    for(int i=1;i<100001;++i){
        fact[i]=(i*fact[i-1])%mod;
    }    
    test(t){
        int n;
        cin>>n;
        cout<<fact[n]<<"\n";

    }
    return 0;
}
