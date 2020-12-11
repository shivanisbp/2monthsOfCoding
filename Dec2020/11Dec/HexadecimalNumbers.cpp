/*
Problem Name: Hexadecimal numbers
Problem Link: https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/yet-another-easy-problem-1f3273a0/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)

int gcd(int x, int fx){
    if (fx == 0)
        return x;
    return gcd(fx, x % fx); 
}

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    test(t){
        int l, r, x=0;
        cin>>l>>r;
        
        for(int i=l; i<=r; ++i){
            int dec=i, fx=0;
            while(dec > 0){
                int r = dec % 16;
                fx += r;
                dec /= 16;
            }
            if(gcd(i, fx) > 1)
                x++;
        }
        cout<<x<<"\n";
    }
    return 0;
}
