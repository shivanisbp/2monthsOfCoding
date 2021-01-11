/*
Problem name: 1539. Kth Missing Positive Number
Problem link: https://leetcode.com/problems/kth-missing-positive-number/
*/

class Solution {
public:
    int findKthPositive(vector<int>& arr, int k) {
        if(arr[0] - 1 >= k)
            return k;
        
        k -= arr[0] - 1;
        int d, i;
        
        for(i = 1; i < arr.size(); i++){
            d = arr[i] - arr[i-1] - 1;
            
            if(d == 0)
                continue;
            else if(d >= k)
                return arr[i-1] + k;
            else
             k -= d;                
        }
        return arr[i - 1] + k;
    }
};
