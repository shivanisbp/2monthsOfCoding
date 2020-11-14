/*
Problem Name: Maximum Of K- size subarrays (Deque)
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/maximum-of-k-size-subarrays-deque/submissions/
*/

#include<bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int N,k;
    cin>>N>>k;
    int A[N],B[k];
    for(int i=0;i<N;++i)    cin>>A[i];
    for(int i=0;i<N-k+1;++i){
        for(int j=0;j<k;++j){
            B[j]=A[i+j];
        }
        cout<<*max_element(B,B+k)<<" ";
    }
    return 0;
}
