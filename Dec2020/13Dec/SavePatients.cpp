/*
Problem Name: Save Patients
Problem Link: https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/save-patients/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int n;
    int vac[n], pat[n];
    for(int i=0;i<n;++i){
        cin>>vac[i];
    }
    for(int i=0;i<n;++i){
        cin>>pat[i];
    }
    sort(vac, vac+n);
    sort(pat, pat+n);
    int sumv = 0, sump = 0;
    for(int i=0;i<n;++i){
        sumv+=vac[i];
        sump+=pat[i];
    }
    if(sumv<sump)
        cout<<"Yes";
    else
        cout<<"No";
    return 0;
}
