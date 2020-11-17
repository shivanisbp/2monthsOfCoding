/*
Problem Name: A Game of Numbers
Problem Link: https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/a-game-of-numbers-1-5d3a8cb3/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int n;
    cin>>n;
    int A[n];
    for(int i=0;i<n;++i){
        cin>>A[i];
    }

    int f=-1,g=-1,j;
    for(int i=0;i<n;++i){
        for(j=i;j<n;++j){
            if(A[j]>A[i]){
                f=A[j];
                break;
            }
        }
        for(j=j+1;j<n;++j){
            if(A[j]<f){
                g=A[j];
                break;
            }
        }
        cout<<g<<" ";
        f=-1,g=-1;
    }
    return 0;
}
