/*
Problem name: Not in Range
Problem link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/not-in-range-44d19403/submissions/
*/

#include<bits/stdc++.h>
using namespace std;

long long NotinRange (int* R, int* L, int n ) {
   long long sum=0,arr[1000001]={0},added=0;
   for(int i=0;i<n;++i){
      arr[L[i]]++;
      arr[R[i]+1]--;
   }

   for(int i=1;i<=1000000;++i){
      added+=arr[i];
      if(added==0){
         sum+=i;
      }
   }
   return sum;
}

int main() {
    
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    cin>>n;
    int L[n],R[n];
    for(int i=0; i<n; i++)
    	cin>>L[i]>>R[i];
    
    long long out_ = NotinRange(R, L, n);
    cout<<out_;
}
