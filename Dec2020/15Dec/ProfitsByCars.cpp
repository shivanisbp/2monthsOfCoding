/*
Problem Name: Profits by cars
Problem Link: https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/jetha-and-cars-2d835131/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    test(t){
        int n;
        cin>>n;
        int P[n];
        for(int i=0;i<n;++i)
            cin>>P[i];
        
        sort(P,P+n);
        long sum=P[0], prev=P[0];
        for(int i=1;i<n;++i){
            if(P[i] != prev){
                sum += P[i];
                prev = P[i];
            }
        }
        cout<<sum<<"\n";
    }
    return 0;
}
