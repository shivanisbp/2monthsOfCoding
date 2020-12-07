/*
Problem Name: 1662. Check If Two String Arrays are Equivalent
Problem Link: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
*/
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "", s2 = "";
        for(String w: word1)
            s1 += w;
        for(String w: word2)
            s2 += w;
        return s1.equals(s2);
    }
}
