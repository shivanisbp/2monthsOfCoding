/*
Problem name: 1588. Sum of All Odd Length Subarrays
Problem link: https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
*/

class Solution {
public:
    int sumOddLengthSubarrays(vector<int>& arr) {
        int sum = 0;
        for(int i=0;i<arr.size();i++){
            int s=0,x=0;
            for(int j=i;j<arr.size();j++){
                s+=arr[j];
                if(x%2==0){
                    sum+=s;
                }
                x++;
            }
        }
       return sum;
        
    }
};
