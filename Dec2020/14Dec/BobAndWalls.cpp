/*
Problem Name: Bob and Walls
Problem Link: https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/bob-and-walls/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    test(t){
        int n, h, last, counted = 1;
        cin>>n;
        cin>>h;
        last=h;
        for(int i=1;i<n;++i){
            cin>>h;
            if(h > last){
                counted++;
                last=h;
            }
        }
        cout<<counted<<"\n";
    }
    return 0;
}
