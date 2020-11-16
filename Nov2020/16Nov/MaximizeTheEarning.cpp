/*
Problem Name: Maximize the Earning
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/maximize-the-earning-137963bc-323025a6/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int S;
    cin>>S;
    while(S--){
        int N,R;
        cin>>N>>R;
        int H[N],b=1,max;
        cin>>H[0];

        max=H[0];
        for(int i=1;i<N;++i){
            cin>>H[i];
            if(max<H[i]){
                max=H[i];
                b++;
            }
        }
        cout<<b*R<<endl;
    }
    return 0;
}
