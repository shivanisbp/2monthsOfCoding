/*
Problem Name: 1408. String Matching in an Array
Problem Link: https://leetcode.com/problems/string-matching-in-an-array/
*/
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i == j)
                    continue;
                if(words[j].indexOf(words[i]) >=0 ){
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
    }
}
