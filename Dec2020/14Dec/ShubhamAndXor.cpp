/*
Problem Name: Shubham and Xor
Problem Link: https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/shubham-and-xor-8526868e/
*/

#include<bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int n;
    cin>>n;
    int a[n];
    for(int i=0 ; i<n ; ++i)
        cin>>a[i];
    
    sort(a,a+n);
    long k = 1, count = 0;
    for(int i=1;i<n;++i){
        if(a[i]==a[i-1]){
            k++;
        }
        else{
            count += k*(k-1)/2;
            k=1;
        }
    }
    count += k*(k-1)/2;
    cout<<count;
    return 0;
}
