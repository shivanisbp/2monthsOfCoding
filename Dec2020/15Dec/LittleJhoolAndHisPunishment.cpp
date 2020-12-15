/*
Problem Name: Little Jhool and his punishment
Problem Link: https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/little-jhool-and-his-punishment/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    test(t){
        int n, b, g;
        cin>>n>>b>>g;
        
        if(abs(b-g) > 1)
            cout<<"Little Jhool wins!\n";
        else
            cout<<"The teacher wins!\n";
    }
    return 0;
}
