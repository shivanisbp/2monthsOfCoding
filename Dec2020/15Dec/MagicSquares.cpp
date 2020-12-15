/*
Problem Name: Magic Squares
Problem Link: https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/magic-squares/
*/

#include<bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    long w, h;
    cin>>w>>h;
    if(w%2 == 0 && h%2 == 0)
        cout<<min(w,h)/2;
    
    else if(w%2 == 1 && h%2 == 1)
        cout<<(min(w,h)+1)/2;
    else
        cout<<"-1";
    return 0;
}
