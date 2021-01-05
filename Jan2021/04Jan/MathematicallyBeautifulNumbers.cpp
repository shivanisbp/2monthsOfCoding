/*
Problem Name: Mathematically beautiful numbers
Problem Link: https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/mathematically-beautiful-numbers-174a158e/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)
#define ll          long long

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    test(t){
        ll x,k;
        bool flag=true;
        cin>>x>>k;
        while(x > 0){
            if(x % k > 1){
                flag=false;
                break;
            }
            x /= k;
        }
        if(flag)
            cout<<"YES\n";
        else
            cout<<"NO\n";
    }
    return 0;
}
