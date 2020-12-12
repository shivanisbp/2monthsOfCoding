/*
Problem Name: Counting Frog Paths
Problem Link: https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/counting-frog-paths-1abd84d5/
*/

#include<bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0); 

    int x, y, s, t, count = 0;
    cin>>x>>y>>s>>t;

    for(int i=x;i<=x+s;++i){
        for(int j=y;j<=y+s;++j)
            if(i+j <= t)
                count++;
    }
    cout<<count;
    return 0;
}
