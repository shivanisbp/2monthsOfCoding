/*
Problem Name: Add Alternate Elements of 2-Dimensional Array
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/add-alternate-elements-of-2-dimensional-array/
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    int arr[3][3],flag=0,sum1=0,sum2=0;
    for(int i=0;i<3;++i){
        for(int j=0;j<3;++j){
            cin>>arr[i][j];
            if(flag==0){
                sum1+=arr[i][j];
                flag=1;
            }
            else{
                sum2+=arr[i][j];
                flag=0;
            }
        }
    }
    cout<<sum1<<endl<<sum2;

    return 0;
}
