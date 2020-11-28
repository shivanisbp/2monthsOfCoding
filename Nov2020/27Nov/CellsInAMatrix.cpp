/*
Problem name: Cells in a matrix
Problem link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/easy-23-6031def9/
*/

#include<bits/stdc++.h>
using namespace std;

long solve(int n, int i, int j) {
   // Write your code here
   static set<int> r;
   static set<int> c;
   r.insert(i);
   c.insert(j);
   return (n-r.size())*(n-c.size());
}

int main() {

   ios::sync_with_stdio(0);
   cin.tie(0);
   
   int n, k;

   cin >> n >> k;

   while(k--) {
      int i, j;

      cin >> i >> j;

      cout << solve(n, i, j) << ' ';
   }

   return 0;
}
