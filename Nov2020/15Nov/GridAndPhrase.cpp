/*
Problem Name: Grid and phrase
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/jadvaliioo-62280ff6/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int n,m;
    cin>>n>>m;
    char A[n][m];
    for(int i=0;i<n;++i){
        for(int j=0;j<m;++j){
            cin>>A[i][j];
        }
    }
    int count=0;
    for(int i=0;i<n;++i){
        for(int j=0;j<m;++j){
            if(A[i][j]=='s'){
                if(j<m-3 && A[i][j+1]=='a' && A[i][j+2]=='b' && A[i][j+3]=='a'){
                    count++;
                }
                if(i<n-3 && A[i+1][j]=='a' && A[i+2][j]=='b' && A[i+3][j]=='a'){
                    count++;
                }
                if(i<n-3 && j<m-3 && A[i+1][j+1]=='a' && A[i+2][j+2]=='b' && A[i+3][j+3]=='a'){
                    count++;
                }
                if(i>=3 && j<m-3 && A[i-1][j+1]=='a' && A[i-2][j+2]=='b' && A[i-3][j+3]=='a'){
                    count++;
                }
            }
        }
    }
    cout<<count<<endl;
    return 0;
}
