/*
Problem Name: 1624. Largest Substring Between Two Equal Characters
Problem Link: https://leetcode.com/problems/largest-substring-between-two-equal-characters/
*/
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int len = -1, n = s.length();
        int position[] = new int[26];
        Arrays.fill(position, -1);
        for(int i=0;i<n;i++){
            int c = s.charAt(i) - 'a';
            if(position[c] == -1){
                position[c] = i;
            }
            else{
                len = Math.max(len, i - position[c] - 1);
            }
        }
        return len;
    }
}
