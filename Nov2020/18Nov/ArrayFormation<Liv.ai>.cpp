/*
Problem name: Array Formation <Liv.ai>
Problem link: https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/circular-list-8e1319c9/submissions/
*/

#include<bits/stdc++.h>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n;
    cin>>n;
    bool prime[1000001]={0};
    prime[0]=1;
     prime[1]=1;
    for(int i=2;i<=1000000;i++){
      if(!prime[i]){
        for(int j=2*i;j<=1000000;j+=i)
          prime[j]=1;
      }
    }
    
    vector<int>s,q;
    for(int i=0;i<n;i++){
      int temp;
      cin>>temp;
      if(!prime[temp])
        q.push_back(temp);
      else s.push_back(temp);
    }
    for(int i=0;i<q.size();i++) cout<<q[i]<<" ";
    cout<<"\n";
    for(int i=s.size()-1;i>=0;i--)  cout<<s[i]<<" ";
    
    return 0;
}
