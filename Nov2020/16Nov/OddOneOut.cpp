/*
Problem Name: Odd one Out
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/find-the-odd/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int n;
    cin>>n;
    int cards[n-1];
    for(int i=0;i<n-1;++i){
        cin>>cards[i];
    }
    sort(cards,cards+n-1);
    for(int j=0,i=1;i<2*n;i=i+2,j++){
        if(cards[j]!=i){
            cout<<i;
            break;
        }
    }
    return 0;
}
