/*
Problem Name: Help Jarvis!
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/help-jarvis-8a39566e/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
        string n;
        int count=1;
        cin>>n;
        sort(n.begin(),n.end());
        for(int i=1;i<n.length();++i){
            if(n[i]-n[i-1]==1)count++;
        }
        if(count==n.size())   cout<<"YES"<<endl;
        else    cout<<"NO"<<endl;
    }
    return 0;
}
