/*
Problem Name: 1678. Goal Parser Interpretation
Problem Link: https://leetcode.com/problems/goal-parser-interpretation/
*/
class Solution {
    public String interpret(String command) {
        String ans = "";
        char arr[] = command.toCharArray();
        for(int i=0;i<arr.length;){
            if(arr[i] == 'G'){
                ans += "G";
                i++;
            }
            else if(arr[i] == '(' && arr[i+1] == ')'){
                ans += "o";
                i += 2;
            }
            else{
                ans += "al";
                i += 4;
            }
        }
        return ans;
    }
}
