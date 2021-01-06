/*
Problem Name: B. Dreamoon and WiFi
Problem Link: http://codeforces.com/problemset/problem/476/B
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)
#define ll          long long

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0); 
    string s1,s2;
    ll actual=0, uk=0, current;
    double ans;
    
    getline(cin, s1);
    getline(cin, s2);
    
    for(int i=0;i<s1.length();++i){
        if(s2[i]=='?')
            uk++;
        if(s1[i]=='+')
            actual++;
        else
            actual--;
        if(s2[i]=='+')
            actual--;
        else if(s2[i]=='-')
            actual++;
    }
    
    if(uk==0){
        ans = (actual == 0)? 1: 0;
    }
    else{
        ll total=pow(2, uk), rem, curr, prob=0;
        for(ll i=0;i<total;++i){
            rem=actual;
            curr=i;
            for(ll j=0;j<uk;++j){
                if((curr & 1) == 0)
                    rem--;
                else
                    rem++;
                curr>>=1;
            }
            if(rem==0){
                prob++;
            }
        }
        ans=(double)prob/total;
    }
    cout<<fixed<<setprecision(12)<<ans;
    
    return 0;
}
