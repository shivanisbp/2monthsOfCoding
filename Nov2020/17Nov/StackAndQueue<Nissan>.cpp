/*
Problem Name: Stack and Queue <Nissan>
Problem Link: https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/staque-1-e790a29f/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int n,k;
    long int sumr=0,suml=0,ans=0;
    cin>>n>>k;
    int A[n];

    for(int i=0;i<n;++i){
        cin>>A[i];
        if(i>=n-k){
            sumr+=A[i];
        }
    }
    for(int i=0;i<k;++i){
        suml+=A[i];
        sumr-=A[n-k+i];
        ans=max(ans,suml+sumr); 
    }
    cout<<ans;
    return 0;
}
