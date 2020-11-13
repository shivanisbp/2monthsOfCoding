/*
Problem name: Charged Up Array
Problem link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/charged-up-array-f35a5e23/
Complete the function Question.
*/

#include<bits/stdc++.h>
using namespace std;

int solve (vector<long long> A) {
    if(A.size()>=64)
        return 0;

    long charge=0, subsets=1, modVal=1000000007;
    subsets=pow(2,A.size()-1);

    for(int i=0;i<A.size();++i){
        if(A[i] >= subsets){
            charge+=A[i];
        }
    }
   return charge%modVal;
}

int main() {

    ios::sync_with_stdio(0);
    cin.tie(0);
    int T;
    cin >> T;
    for(int t_i=0; t_i<T; t_i++)
    {
        int N;
        cin >> N;
        vector<long long> A(N);
        for(int i_A=0; i_A<N; i_A++)
        {
        	cin >> A[i_A];
        }

        int out_;
        out_ = solve(A);
        cout << out_;
        cout << "\n";
    }
}
