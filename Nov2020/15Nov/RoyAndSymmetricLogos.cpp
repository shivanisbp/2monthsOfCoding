/*
Problem Name: Roy and Symmetric Logos
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/roy-and-symmetric-logos-1/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int t,N;
    cin>>t;
    while(t--){
        bool symmetric=true;
        cin>>N;
        string mat[N];
        for(int i=0;i<N;++i){
            cin>>mat[i];
        }

        for(int i=0;i<N;++i){
            for(int j=0;j<N;++j){
                if(mat[i][j]!=mat[i][N-1-j]){
                    symmetric=false;
                    break;
                }
                if(mat[i][j]!=mat[N-1-i][j]){
                    symmetric=false;
                    break;
                }
            }
            if(!symmetric){
                break;
            }
        }
        if(symmetric)   cout<<"YES"<<endl;
        else    cout<<"NO"<<endl;
    }
    return 0;
}
