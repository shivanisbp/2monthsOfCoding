/*
Problem Name: Strange Game
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/strange-game-1-7e758acb-1bff10f0/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    //To solve the TLE error
    cin.tie(0);             // To solve the TLE error
    int t;
    cin>>t;
    while(t--){
        int n,k,maxv=INT_MIN;
        long long runtime=0;
        cin>>n>>k;
        int alice[n],bob;
        for(int i=0;i<n;++i)    cin>>alice[i];
        for(int i=0;i<n;++i){
            cin>>bob;
            maxv=max(maxv,bob);
        } 
        for(int i=0;i<n;++i){
            if(maxv+1>alice[i]){
                runtime+=((maxv-alice[i]+1)*k);
            }
        }
        cout<<runtime<<endl;
    }
    return 0;
}
