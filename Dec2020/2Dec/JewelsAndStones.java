/*
Problem Name: 771. Jewels and Stones
Problem Link: https://leetcode.com/problems/jewels-and-stones/
*/
class Solution {
    public int numJewelsInStones(String J, String S) {
        int stones[] = new int[128];
        for(char c: S.toCharArray())
            stones[c]++;
        int jewels = 0;
        for(char c: J.toCharArray())
            jewels += stones[c];
        return jewels;
    }
}
