/*
Problem Name: Find the String
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/find-the-string-4014dec6/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int t;
    cin>>t;
    while(t--){
        int n,m,found=0;
        string s;
        cin>>n>>m;
        char mat[n][m];
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                cin>>mat[i][j];
            }
        }
        cin>>s;

        for(int i=0;i<s.length();++i){
            found=0;
            for(int j=0;j<m;++j){
                if(s[i]==mat[i%n][j]){
                    found=1;
                    mat[i%n][j]=' ';
                    break;
                }
            }
            if(found!=1){
                cout<<"No"<<endl;
                break;
            }  
        }
        if(found==1)    cout<<"Yes"<<endl;
    }
    return 0;
}
