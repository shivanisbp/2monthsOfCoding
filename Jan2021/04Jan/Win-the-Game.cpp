/*
Problem Name: Win-the-Game
Problem Link: https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/win-the-game/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)
#define ll          long long

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    test(t){
        long double R, G, prob=0, prev=1;
        cin>>R>>G;
        if(R==0 || G==0)
            prob=1;
        else{
            while(G>=0){
                prob += ((prev*R)/(R+G));
                prev *= (G*(G-1))/((R+G)*(R+G-1));
                G -= 2;
            }
        }
        cout<<fixed<<setprecision(6)<<prob<<"\n";
    }
    return 0;
}
