/*
Problem Name: Pepper and Contiguous Even Subarray 
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/pepper-and-contiguous-even-subarray-9f3adf65/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
        int n,count=0,res=0;
        cin>>n;
        int A[n];
        for(int i=0;i<n;++i){
            cin>>A[i];
            if(A[i]%2==0){
                count++;
                if(count>res){
                    res=count;
                }
            }
            else{
                count=0;
            }
        }
        if(res==0)  cout<<"-1"<<endl;
        else    cout<<res<<endl;
    }
    return 0;
}
