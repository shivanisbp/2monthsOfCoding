/*
Problem Name: Will Rick survive or not
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/will-rick-survive-or-not-2/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int t;
    cin>>t;
    while(t--){
        int n, killed = 0, flag= 0, j = 0;
        cin>>n;
        int D[n];
        for(int i=0;i<n;++i){
            cin>>D[i];
        }
        sort(D,D+n);
        for(int i=0;i<n;++i){
            if(i % 6 == 0)
              j+=1;
              
            D[i]-=i+j;
            if(D[i]>=0)
                killed++;
            
            else{
                flag = 1;
                break;
            }
        }
        if(flag !=1)    cout<<"Rick now go and save Carl and Judas\n";
        else
            cout<<"Goodbye Rick\n"<<killed<<"\n";
    
    }
    return 0;
}
