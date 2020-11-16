/*
Problem Name: Mark The Answer
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/mark-the-answer-1/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int N,X;
    cin>>N>>X;
    int A[N];
    for(int i=0;i<N;++i){
        cin>>A[i];
    }

    int maxscore=0,skipped=0;
    for(int i=0;i<N;++i){
        if(A[i]<=X){
            maxscore++;
        }
        else if(skipped<1){
            skipped++;
        }
        else{
            break;
        }
    }
    cout<<maxscore;
    return 0;
}

