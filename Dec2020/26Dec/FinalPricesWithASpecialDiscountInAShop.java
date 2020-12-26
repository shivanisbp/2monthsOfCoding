/*
Problem Name: 1475. Final Prices With a Special Discount in a Shop
Problem Link: https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
*/
class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<Integer>();
        int n = prices.length;
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                st.push(i);
            }
            else if(prices[st.peek()] < prices[i])
                st.push(i);
            else{
                while(!st.isEmpty() && prices[st.peek()] >= prices[i]){
                    int pop = st.pop();
                    prices[pop] -= prices[i];
                }
                st.push(i);
            }
        }
        return prices;
    }
}
