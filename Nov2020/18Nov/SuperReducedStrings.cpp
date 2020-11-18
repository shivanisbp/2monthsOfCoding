/*
Problem Name: super reduced strings
Problem Link: https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/super-reduced-strings-303701dd/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    string s;
    cin>>s;
    int n=s.length(),i=0;
    while(i<n){
        i++;
        if(i>0 && s[i]==s[i-1]){
            s.erase(i-1,2);
            i=i-2;
        }
    }
    if(s.length()>0)    cout<<s;
    else    cout<<"Empty String";
    return 0;
}
