/*
Problem Name: ( Problem A ) Pikachu and the Game of Strings
Problem Link: https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/pikachu-and-the-game-of-strings-1-8c22a8ce/
*/

#include<bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int n, days=0;
    string s, t;
    cin>>n>>s>>t;
    int i=0;
    while(i<n){
        int diff = t[i] - s[i];
        if(diff < 0){
            diff = 'Z'- s[i];
            diff = diff + t[i] - 'A' + 1;
        }
        if(diff < 13)
            days += diff;
        
        else
            days += diff/13 + diff%13;
        i++;
    }
    cout<<days;
    return 0;
}
