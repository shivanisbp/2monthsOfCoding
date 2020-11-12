/*
Problem name: Long ATM Queue
Problem link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/long-atm-queue-3/
*/

#include <bits/stdc++.h>
using namespace std;

int main(){
    long int n,groups=1;
    cin>>n;
    long int H[n];
    cin>>H[0];
    for(int i=1;i<n;++i){
        cin>>H[i];
        if(H[i]<H[i-1]) groups++;
    }
    cout<<groups;
    
    return 0;
}
