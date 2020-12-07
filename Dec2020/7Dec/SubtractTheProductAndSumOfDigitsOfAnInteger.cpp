/*
Problem name: 1281. Subtract the Product and Sum of Digits of an Integer
Problem link: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
*/

class Solution {
public:
    int subtractProductAndSum(int n) {
        int product = 1, sum = 0;
        while(n>0){
            product *= n%10;
            sum += n%10;
            n /= 10;
        }
        return product - sum;
    }
};
