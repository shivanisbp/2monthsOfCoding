/*
Problem Name: The Old Monk
Problem Link: https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/the-old-monk/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    test(t){
        int n;
        cin>>n;
        long long A[n], B[n];
        for(int i=0;i<n;++i)
            cin>>A[i];
        for(int i=0;i<n;++i)
            cin>>B[i];
        
        int i = 0, j = 0, ans = 0;
        while(i < n && j < n){
            if(B[j] >= A[i]){
                ans = max(ans, j-i);
                j++;
            }
            else
                i++;
        }
        cout<<ans<<"\n";
    }
    return 0;
}
