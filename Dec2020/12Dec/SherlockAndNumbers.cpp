/*
Problem Name: Sherlock and Numbers
Problem Link: https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/sherlock-and-numbers/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    test(t){
        int n, k, p, num, c = 0;
        cin>>n>>k>>p;
        for(int i=0; i<k; ++i){
            cin>>num;
            if(num <= p + c)
                c++;
        }
        if(k + p <= n)
            cout<<c+p<<"\n";
        else
            cout<<"-1"<<"\n";
    }
    return 0;
}
