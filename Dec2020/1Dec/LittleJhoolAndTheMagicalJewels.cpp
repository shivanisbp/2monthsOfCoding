/*
Problem Name: Little Jhool and the Magical Jewels
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/little-jhool-and-the-magical-jewels/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    test(t){
        string s;
        int r=0, u=0, b=0, y=0;
        cin>>s;

        for(int i=0;i<s.length();++i){
            if(s[i]=='r')   r++;
            else if(s[i]=='u')   u++;
            else if(s[i]=='b')   b++;
            else if(s[i]=='y')   y++;
        }

        cout<<min(r,min(u,min(b,y)))<<"\n";
    }
    return 0;
}
