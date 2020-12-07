/*
Problem Name: 1281. Subtract the Product and Sum of Digits of an Integer
Problem Link: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
*/
class Solution {
    public int subtractProductAndSum(int n) {
        int p = 1, s = 0;
        while(n > 0){
            s += n%10;
            p *= n%10;
            n /= 10;
        }
        return p - s;
    }
}
