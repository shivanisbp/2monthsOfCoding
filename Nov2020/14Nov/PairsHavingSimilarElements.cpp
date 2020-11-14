/*
Problem name: Pairs Having Similar Elements
Problem link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/pairs-having-similar-element-eed098aa/
Complete the function.
*/

#include<bits/stdc++.h>
using namespace std;

long long SimilarElementsPairs (vector<int> A,int N) {
   long long count=0,same=0,all=0;
   sort(A.begin(),A.end());
   for(int i=0;i<N;++i){
      if(A[i]+1==A[i+1]){
         all++;
      }      
      else if(A[i]==A[i+1]){
         same++;
         all++;
      }
      else{
         if(same!=all)
            count+=all*(all+1)/2;
         same=0;
         all=0;
      }   
   }
   return count;
}

int main() {

    ios::sync_with_stdio(0);
    cin.tie(0);
    int N;
    cin >> N;
    vector<int> A(N);
    for(int i_A=0; i_A<N; i_A++)
    {
    	cin >> A[i_A];
    }

    long long out_;
    out_ = SimilarElementsPairs(A,N);
    cout << out_;
}
