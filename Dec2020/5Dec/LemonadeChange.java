/*
Problem Name: 860. Lemonade Change
Problem Link: https://leetcode.com/problems/lemonade-change/
*/
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for(int i=0;i<bills.length;i++){
            if(bills[i] == 5)
                five++;
            else if(bills[i] == 10){
                if(five == 0)
                    return false;
                five--;
                ten++;
            }
            else{
                if(ten == 0){
                    if(five < 3)
                        return false;
                    five -= 3;
                }
                else{
                    if(five == 0)
                        return false;
                    five--;
                    ten--;
                }   
            }
        }
        return true;
    }
}
