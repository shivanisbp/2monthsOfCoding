/*
Problem Name: Chandu and Consecutive Letters
Problem Link: https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/chandu-and-consecutive-letters/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    test(t){
        string s="",z="";
        cin>>s;
        int i=0, n=s.length();
        z=s[0];
        while(i<n-1){
            i++;
            if(s[i] != s[i-1]){
                z+=s[i];
            }
        }
        cout<<z<<"\n";
    }
    return 0;
}
