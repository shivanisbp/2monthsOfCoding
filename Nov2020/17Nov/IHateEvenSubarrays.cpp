/*
Problem Name: I hate Even Subarrays
Problem Link: https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/i-hate-even-subarrays/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int t;
    cin>>t;
    while(t--){
        string s;
        int n,i=0;
        cin>>s;
        n=s.length();
        while(i<n){
            i++;
            if(i>0 && s[i]==s[i-1]){
                s.erase(i-1,2);
                i=i-2;
            }
        }
        if(s.length()>0)    cout<<s<<endl;
        else    cout<<"KHALI"<<endl;
    }
    return 0;
}
