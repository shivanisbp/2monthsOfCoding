/*
Problem Name: Neutralisation of charges
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/charges-repel/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    int n,flag=0,i=0;
    cin>>n;
    string s;
    cin>>s;
    while(i<n){
        i++;
        if(i>0 &&s[i]==s[i-1]){
            s.erase(i-1,2);
            i=i-2;
        }
        
    }
    cout<<s.length()<<endl<<s;
    return 0;
}
