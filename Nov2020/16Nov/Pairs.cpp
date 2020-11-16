/*
Problem Name: Pairs
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/pairs-16/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int t;
    cin>>t;
    int prime[100001];
    for(int i=0;i<100001;++i){
        prime[i]=1;
    }
    prime[0]=0;
    prime[1]=0;
    for(int i=2;i<100001;i++){
        for(int j=2*i;j<100001;j+=i){
            prime[j] = 0;
        }   
    }
    
    for(int i=1;i<=100000;i++){
        prime[i] += prime[i-1];
    }
       
    while(t--){
        int l,r;
        cin>>l>>r; 
        int p=0,c=0;
        p=prime[r]-prime[l-1];
        c=r-l+1-p;
        if(l==1)c--;
        cout<<p*c<<endl;
    }
    return 0;
}
