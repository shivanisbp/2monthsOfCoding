/*
Problem Name: 1684. Count the Number of Consistent Strings
Problem Link: https://leetcode.com/problems/count-the-number-of-consistent-strings/
*/
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int allow[] = new int[26];
        for(char c:allowed.toCharArray())
            allow[c - 'a'] = 1;
        int consistent_count = 0;
        for(int i=0;i<words.length;i++){
            int word[] = new int[26];
            boolean consistent = true;
            for(char c:words[i].toCharArray())
                if(allow[c - 'a'] != 1){
                    consistent = false;
                    break;
                }
            if(consistent)
                consistent_count++;
        }
        return consistent_count;
    }
}
