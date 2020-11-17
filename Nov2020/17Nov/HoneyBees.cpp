/*
Problem Name: Honey Bees
Problem Link: hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/honey-bees/description/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int t;
    cin>>t;
    while(t--){
        int n,m,q;
        cin>>n>>m;
        int H[n][m];
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                cin>>H[i][j];
            }
        }
        cin>>q;
        int mode[q], X[q],Y[q];
        for(int i=0;i<q;++i){
            cin>>mode[i]>>X[i]>>Y[i];
        }
        
        int sum=0;
        for(int i=0;i<q;++i){
            sum=0;
            if(mode[i]==1){
                if(Y[i]%2!=0){
                    if(X[i]>0)    sum+=H[X[i]-1][Y[i]];
                    if(Y[i]>0)     sum+=H[X[i]][Y[i]-1];
                    if(X[i]<n-1 && Y[i]>0)  sum+=H[X[i]+1][Y[i]-1];
                    if(X[i]<n-1)    sum+=H[X[i]+1][Y[i]];
                    if(X[i]<n-1 && Y[i]<m-1)   sum+=H[X[i]+1][Y[i]+1];
                    if(Y[i]<m-1)    sum+=H[X[i]][Y[i]+1];
                }
                else{
                    if(X[i]>0)    sum+=H[X[i]-1][Y[i]];
                    if(X[i]>0 && Y[i]>0)    sum+=H[X[i]-1][Y[i]-1];
                    if(Y[i]>0)     sum+=H[X[i]][Y[i]-1];
                    if(X[i]<n-1)    sum+=H[X[i]+1][Y[i]];
                    if(Y[i]<m-1)    sum+=H[X[i]][Y[i]+1];
                    if(X[i]>0 && Y[i]<m-1)    sum+=H[X[i]-1][Y[i]+1];
                }
            }
            else{
                if(Y[i]%2!=0){
                    if(X[i]>1)    sum+=H[X[i]-2][Y[i]];
                    if(X[i]>0 && Y[i]>0)    sum+=H[X[i]-1][Y[i]-1];
                    if(X[i]>0 && Y[i]>1)    sum+=H[X[i]-1][Y[i]-2];
                    if(Y[i]>1)     sum+=H[X[i]][Y[i]-2];
                    if(X[i]<n-1 && Y[i]>1)  sum+=H[X[i]+1][Y[i]-2];
                    if(X[i]<n-2 && Y[i]>0)  sum+=H[X[i]+2][Y[i]-1];
                    if(X[i]<n-2)    sum+=H[X[i]+2][Y[i]];
                    if(X[i]<n-2 && Y[i]<m-1)  sum+=H[X[i]+2][Y[i]+1];
                    if(X[i]<n-1 && Y[i]<m-2)  sum+=H[X[i]+1][Y[i]+2];
                    if(Y[i]<m-2)    sum+=H[X[i]][Y[i]+2];
                    if(X[i]>0 && Y[i]<m-2)    sum+=H[X[i]-1][Y[i]+2];
                    if(X[i]>0 && Y[i]<m-1)    sum+=H[X[i]-1][Y[i]+1];
                }
                else{
                    if(X[i]>1)    sum+=H[X[i]-2][Y[i]];
                    if(X[i]>1 && Y[i]>0)    sum+=H[X[i]-2][Y[i]-1];
                    if(X[i]>0 && Y[i]>1)    sum+=H[X[i]-1][Y[i]-2];
                    if(Y[i]>1)     sum+=H[X[i]][Y[i]-2];
                    if(X[i]<n-1 && Y[i]>1)  sum+=H[X[i]+1][Y[i]-2];
                    if(X[i]<n-1 && Y[i]>0)  sum+=H[X[i]+1][Y[i]-1];
                    if(X[i]<n-2)    sum+=H[X[i]+2][Y[i]];
                    if(X[i]<n-1 && Y[i]<m-1)  sum+=H[X[i]+1][Y[i]+1];
                    if(X[i]<n-1 && Y[i]<m-2)  sum+=H[X[i]+1][Y[i]+2];
                    if(Y[i]<m-2)    sum+=H[X[i]][Y[i]+2];
                    if(X[i]>0 && Y[i]<m-2)    sum+=H[X[i]-1][Y[i]+2];
                    if(X[i]>1 && Y[i]<m-1)    sum+=H[X[i]-2][Y[i]+1];
                }
            }  
            cout<<sum<<endl;
        }
    }
    return 0;
}
