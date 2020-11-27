/*
Problem Name: Remove Friends
Problem Link: https://www.hackerearth.com/practice/data-structures/linked-list/singly-linked-list/practice-problems/algorithm/remove-friends-5/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int t;
    cin>>t;
    while(t--){
        int n,k,val;
        cin>>n>>k;
        vector<int> fri;
        for(int i=0;i<n;++i){
            cin>>val;
            fri.push_back(val);
        }

        int deleted=0,i=1;
        deque<int> s;
        s.push_back(fri[0]);
        while(i<n){
            while(deleted<k && !s.empty() && s.back()<fri[i]){
                deleted++;
                s.pop_back();
            }
            s.push_back(fri[i]);
            i++;
        }
        while(!s.empty()){
            cout<<s.front()<<" ";
            s.pop_front();
        }   
        cout<<"\n";
    }
    return 0;
}
