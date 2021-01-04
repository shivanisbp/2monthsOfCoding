/*
Problem Name: Maximum profit
Problem Link: https://www.hackerearth.com/problem/algorithm/maximum-profit-5-c3c2ce7c/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)
#define ll          long long

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);     

    test(t){
        ll N, k, profit=0;
        set<ll> res;
        vector<ll> coins;
        cin>>N>>k;
        for(ll i=0;i<N;++i){
            int ele;
            cin>>ele;
            coins.push_back(ele);
        }
        
        sort(coins.begin(), coins.end(), greater<ll>());
        
        for(ll i=0;i<N;++i){
            if(k==0)
                break;
            if(!res.count(coins[i])){
                res.insert(coins[i]);
                profit += coins[i];
                k--;
            }
        }
        cout<<profit<<"\n";
    }
    return 0;
}
