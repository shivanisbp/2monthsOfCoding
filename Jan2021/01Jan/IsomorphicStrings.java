/*
Problem Name: 205. Isomorphic Strings
Problem Link: https://leetcode.com/problems/isomorphic-strings/
*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        Set<Character> set = new HashSet<Character>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char c1 = s.charAt(i), c2 = t.charAt(i);
            if(map.containsKey(c1)){
                if(map.get(c1) != c2)
                    return false;
            }
            else{
                if(set.contains(c2))
                    return false;
                set.add(c2);
                map.put(c1,c2);
            }
        }
        return true;
    }
}
