/*
Problem Name: 1528. Shuffle String
Problem link: https://leetcode.com/problems/shuffle-string/
*/
class Solution {
    public String restoreString(String s, int[] indices) {
        char arr[] = s.toCharArray(), ans[] = new char[s.length()];
        for(int i=0;i<indices.length;i++){
            ans[indices[i]] = arr[i];
        }
        return new String(ans);
    }
}
