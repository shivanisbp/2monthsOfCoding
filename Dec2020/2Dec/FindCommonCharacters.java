/*
Problem Name: 1002. Find Common Characters
Problem Link: https://leetcode.com/problems/find-common-characters/
*/
class Solution {
    public List<String> commonChars(String[] A) {
        int coll[] = new int[26];
        for(int i=0;i<A[0].length();i++)
            coll[A[0].charAt(i)-'a']++;
        for(int i=1;i<A.length;i++){
            int temp[] = new int[26];
            for(int j=0;j<A[i].length();j++)
                temp[A[i].charAt(j)-'a']++;
            for(int j=0;j<26;j++)
                coll[j] = Math.min(coll[j],temp[j]);
        }
        List<String> ans = new ArrayList<String>();
        for(int i=0;i<26;i++){
            for(int j=0;j<coll[i];j++){
                ans.add(""+(char)(i+'a'));
            }
        }
        return ans;
    }
}
