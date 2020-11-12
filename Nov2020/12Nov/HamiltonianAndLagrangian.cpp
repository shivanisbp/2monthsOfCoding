/*
Problem name: Hamiltonian and Lagrangian
Problem link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/hamiltonian-and-lagrangian/
*/

#include <bits/stdc++.h>
using namespace std;

int main(){
    long n;
    cin>>n;
    long int marks[n];
    cin>>marks[0];
    for(int i=1;i<n;++i){
        cin>>marks[i];
    }

    stack <int> s;
    s.push(marks[n-1]);
    for(int i=n-2;i>=0;--i){
        if(marks[i]>=s.top()){
            s.push(marks[i]);
        }
    }

    while(!s.empty()){
        cout<<s.top()<<" ";
        s.pop();
    }
    
    return 0;
}
