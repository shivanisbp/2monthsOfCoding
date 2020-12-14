/*
Problem Name: Coprimes
Problem Link: https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/coprimed-32042ef1/
*/

#include<bits/stdc++.h>
using namespace std;

int gcd(int a, int b){
    if(b == 0)
        return a;
    gcd(b, a%b);
}

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int n, i;
    cin>>n;
    for(i = n-2; i>=0; --i){
        if(gcd(i,n) == 1){
            break;
        }
    }
    cout<<i;
    return 0;
}
