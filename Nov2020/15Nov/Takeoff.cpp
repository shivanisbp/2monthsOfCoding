/*
Problem Name: Takeoff
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/no-sharing-capillary-82ed3fe2/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int t;
    cin>>t;
    while(t--){
        int N,p,q,r,a,b,c,takeoffs=0;  //a,b,c represent if a wants to travel that particular day or not.
        cin>>N>>p>>q>>r;
        for(int i=1;i<=N;++i){
            a=i%p;
            b=i%q;
            c=i%r;
            if((!a && b && c) || (a && !b && c) || (a && b && !c)){
                takeoffs++;
            }
        }
        cout<<takeoffs<<endl;
    }
    return 0;
}
