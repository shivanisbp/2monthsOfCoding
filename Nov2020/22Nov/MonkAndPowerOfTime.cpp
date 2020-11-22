/*
Problem Name: Monk and Power of Time
Problem Link: https://www.hackerearth.com/practice/data-structures/queues/basics-of-queues/practice-problems/algorithm/monk-and-power-of-time-3a648bf0/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);    
    cin.tie(0);             
    int N;
    cin>>N;
    int val;
    vector<int> calling,ideal;
    for(int i=0;i<N;++i){
        cin>>val;
        calling.push_back(val);
    }
    for(int i=0;i<N;++i){
        cin>>val;
        ideal.push_back(val);
    }

    int ans=0,c=0,i=0;
    while(i<N){
        if(calling[c%N]==ideal[i]){
            i++;
            c++;
        }
        else{
            calling.push_back(calling[c]);
            calling.erase(calling.begin()+c);
            
        }    
        ans++;
    }
    cout<<ans;
    return 0;
}
