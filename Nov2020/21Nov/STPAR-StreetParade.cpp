/*
Problem name: STPAR - Street Parade
Problem link: https://www.spoj.com/problems/STPAR/
*/

#include <bits/stdc++.h>
using namespace std;

int main() {
	ios::sync_with_stdio(0);    
    cin.tie(0);
    string ans="";
	while(true){
    	int n;
    	cin>>n;
    	if(n==0)    
    	    break;
    	int A[n];
    	for(int i=0;i<n;++i){
    		cin>>A[i];
    	}
    	stack<int> s;
    	
    	int count=1;
    	for(int i=0;i<n;++i){
    		if(A[i]==count || (s.size()>0 && s.top()==count)){
    			if((s.size()>0) && (s.top()==count)){
    				s.pop();
    				i--;
    			}	
    			count++;
    			continue;
    		}
    		s.push(A[i]);
    	}
    	while(count<n+1){
    	    if(s.top()!=count){
    	        break;
    	    }
    	    count++;
    	    s.pop();
    	}
    	
    	if(s.size()>0)	ans+="no\n";
    	else	ans+="yes\n";
	}
	cout<<ans;
	return 0;
}
