/*
Problem Name: balanced brackets
Problem Link: https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/balanced-brackets-3-4fc590c6/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int n;
    cin>>n;
    while(n--){
        stack <char> b;
        string s;
        bool valid=true;
        cin>>s;
        for(int i=0;i<s.length();++i){
            if(s[i]=='(' || s[i]=='{' || s[i]=='['){
                b.push(s[i]);
            }
            else if(s[i]==')'  && b.size()>0 && b.top()=='('){
                b.pop();
            }
            else if(s[i]=='}'  && b.size()>0 && b.top()=='{'){
                b.pop();
            }
            else if(s[i]==']' && b.size()>0 && b.top()=='['){
                b.pop();
            }
            else{
                valid=false;
                break;
            }
        }
        if(!valid || b.empty()==false)  cout<<"NO"<<endl;
        else    cout<<"YES"<<endl;
    }
    return 0;
}
