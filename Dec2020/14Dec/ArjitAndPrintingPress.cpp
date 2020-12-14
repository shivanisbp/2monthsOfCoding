/*
Problem Name: Arjit and Printing Press
Problem Link: https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/arjit-and-printing-press/
*/

#include<bits/stdc++.h>
using namespace std;

#define test(t)     int t; cin>>t; while(t--)

int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    test(t){
        string word, reserve;
        cin>>word>>reserve;
        
        sort(reserve.begin(), reserve.end());
        int i = 0, j = 0;
        while(i < word.size() && j < reserve.size()){
            if(word[i] > reserve[j]){
                word[i] = reserve[j];
                j++;
            }
            i++;
        }
        cout<<word<<"\n";
    }
    return 0;
}
