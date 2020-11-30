/*
Problem Name: Aman and lab file work
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/aman-and-lab-file-work-8cd1d24c/
*/

#include<bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int n;
    cin>>n;
    int t,d, add=1;
    map<int,int> m;
    for(int i=0;i<n;++i){
        cin>>t>>d;
        if(m[t+d]>0)
            m[t+d+1] = add;
        
        else
            m[t+d]=add;
        
        add++;
    }

    for(auto l: m){
        cout<<l.second<<" ";
    }
    return 0;
}
