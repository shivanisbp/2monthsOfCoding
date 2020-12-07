/*
Problem name: 1588. Sum of All Odd Length Subarrays
Problem link: https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
*/

class Solution {
public:
    int sumOddLengthSubarrays(vector<int>& arr) {
        int sum = 0;
        for(int i=0;i<arr.size();++i){
            int a=0,b=0;
            for(int j=i;j<arr.size();++j){
                a += arr[j];
                if(b%2==0){
                    sum+=a;
                }
                b++;
            }
        }
       return sum;
    }
};
