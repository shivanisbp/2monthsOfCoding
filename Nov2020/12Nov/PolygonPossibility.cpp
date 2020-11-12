/*
Problem name: Polygon Possibility
Problem link: hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/polygon-possible/
*/

#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
	long int n;
	cin>>t;
	while(t--){
		cin>>n;
		long int l[n],sum=0,flag=0;
		for(int i=0;i<n;++i){
			cin>>l[i];
			sum+=l[i];
		}	
		for(int i=0;i<n;++i){
			if(l[i]>=sum-l[i]){
				cout<<"No"<<endl;
				flag=1;
				break;
			}
		}
		if(flag==0)	cout<<"Yes"<<endl;
	}
    return 0;
}
