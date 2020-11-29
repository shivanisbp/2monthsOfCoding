/*
Problem Name: Bracket sequences
Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/bracket-sequence-1-40eab940/
*/

#include<bits/stdc++.h>
using namespace std;

int main(){
    string s;
    int n, count=0;
    getline(cin,s);
    n=s.length();
    int arr[n],minVal=0;

    for(int i=0;i<n;++i){
        if(s[i]=='(')
            arr[i] = 1;
        else
            arr[i] = -1;
    }
    for(int i=1;i<n;++i){
        arr[i]+=arr[i-1];
        minVal = min(minVal, arr[i]);
    }

    if(arr[n-1]!=0)
        cout<<"0";
    
    else{
        for(int i=0;i<n;++i){
            if(arr[i] == minVal)
                count++;
        }
        cout<<count;
    }
    return 0;
}
