/*
Problem Name: KK and crush
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/exists/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    test(t){
        int n,k;
        cin>>n;
        int val, pos[100001]={0}, neg[100001]={0};
        for(int i=0;i<n;++i){
            cin>>val;
            if(val>=0)
                pos[val]=1;
            else
                neg[-1*val]=1;
        }
        cin>>k;

        for(int i=0;i<k;++i){
            int q;
            cin>>q;

            if(q >= 0)
                if(pos[q])
                   cout<<"Yes\n";
                else
                    cout<<"No\n";
            else
                if(neg[-1*q])
                    cout<<"Yes\n";
                else
                    cout<<"No\n";
        }
    }
    return 0;
}
