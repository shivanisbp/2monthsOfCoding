/*
Problem Name: Bishu and Soldiers
Problem Link: https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/bishu-and-soldiers/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)
#define ll          long long

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    ll n, q;
    cin>>n;
    ll soldiers[n];
    for(ll i=0;i<n;++i)
        cin>>soldiers[i];
    cin>>q;
    ll bishu[q];
    for(ll i=0;i<q;++i)
        cin>>bishu[i];
    
    ll sum, num;
    sort(soldiers,soldiers+n);
    for(int i=0;i<q;++i){
        sum = 0, num = 0;
        for(int j=0;j<n;++j){
            if(soldiers[j]<=bishu[i]){
                sum+=soldiers[j];
                num++;
            }
            else
                break;
        }
        cout<<num<<" "<<sum<<"\n";
    }
    return 0;
}
