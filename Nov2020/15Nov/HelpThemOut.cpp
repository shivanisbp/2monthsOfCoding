/*
Problem Name: Help them Out
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/solve-friends-problem/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int N;
    cin>>N;
    int g[N];
    for(int i=0;i<N;++i)
        cin>>g[i];
    int moves=0,odd=0,sum=0,flag=0;
    while(flag!=1){
        odd=0,sum=0;
        for(int i=0;i<N;++i){
            if(g[i]%2!=0){
                g[i]-=1;
                moves++;
                odd=1;
            }
            sum+=g[i];
        }
        if(sum!=0 && odd!=1){
            moves++;
            for(int i=0;i<N;++i){
                g[i]/=2;
            }
        }
        else if(sum==0){
            flag=1;
        }
    }
    cout<<moves;
    return 0;
}
