/*
Problem Name: Perfect Pair
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/perfect-pair-df920e90/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int t;
    cin>>t;
    bool perfect[2001]={false};
    for(int i=1;i*i<=2000;i++){
        perfect[i*i]=true;
        for(int j=1;j*j*j<=2000;j++)
            perfect[j*j*j]=true;
    }

    while(t--){
        int n;
        cin>>n;
        int A[n];
        map<int,int> m;
        for(int i=0;i<n;++i){
            cin>>A[i];
            m[A[i]]++;
        }
        
        int pairs=0;
        for(int i=1;i<1001;++i){
            if(perfect[2*i] == true)
                pairs+=m[i]*(m[i]-1)/2;
            for(int j=i+1;j<1001;++j){
                if(perfect[i+j] == true)
                    pairs+=m[i]*m[j];
            }
        }
        cout<<pairs<<"\n";
    }
    return 0;
}
