/*
Problem Name: Modify Sequence
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/modify-sequence/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int N;
    cin>>N;
    int a[N],f,s;
    cin>>a[0];
    f=a[0];
    for(int i=1;i<N;++i){
        cin>>a[i];
        s=a[i];
        f=s-f;
        if(f<0){
            break;
        }
    }
    if(f==0)   cout<<"YES";
    else    cout<<"NO";
    return 0;
}
