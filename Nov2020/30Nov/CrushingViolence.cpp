/*
Problem Name: Crushing Violence
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/crushing-violence/
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
        int boy[n+1]={0}, girl[n+1]={0}, boyhitby[n+1]={0}, girlhitby[n+1]={0}, worst = 0, pairs = 0;
        for(int i=1;i<=n;++i)
            cin>>boy[i];
        for(int i=1;i<=n;++i)
            cin>>girl[i];
    
        for(int i=0;i<n;++i){
            if(i+1 != girl[boy[i+1]]){
                boyhitby[girl[boy[i+1]]]++;
                girlhitby[boy[girl[i+1]]]++;

                worst = max(worst, boyhitby[girl[boy[i+1]]]);
                worst = max(worst, girlhitby[boy[girl[i+1]]]);

                if(i+1 == girl[boy[girl[boy[i+1]]]]){
                    pairs++;
                }
            } 
        }
        cout<<worst<<" "<<pairs<<"\n";
    }
    return 0;
}
