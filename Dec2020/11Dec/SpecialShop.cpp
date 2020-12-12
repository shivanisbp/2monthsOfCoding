/*
Problem Name:  Special Shop
Problem Link: https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/special-shop-69904c91/description/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    test(t){
        long n, a, b;
        long long money;
        cin>>n>>a>>b;
        double min = (double)(n*b)/(a+b);
        min = round(min);
        money = a*min*min + b*(n-min)*(n-min);
        cout<<money<<"\n";
    }
    return 0;
}
