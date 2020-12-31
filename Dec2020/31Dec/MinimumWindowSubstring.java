/*
Problem Name: 76. Minimum Window Substring
Problem Link: https://leetcode.com/problems/minimum-window-substring/
*/
class Solution {
    public String minWindow(String s, String t) {
        if(s.length() == 0 || t.length() == 0)
            return "";
        HashMap<Character,Integer> tmap = new HashMap<Character,Integer>();
        for(char c:t.toCharArray())
            tmap.put(c,tmap.getOrDefault(c,0) + 1);
        HashMap<Character,Integer> smap = new HashMap<Character,Integer>();
        int l_lim = 0, r_lim = Integer.MAX_VALUE, ans = Integer.MAX_VALUE;
        s = s + "@";
        boolean found = false;
        for(int l=0,r=0;r<s.length();){
            if(!equals(smap,tmap)){
                smap.put(s.charAt(r), smap.getOrDefault(s.charAt(r),0) + 1);
                r++;
            }
            else{
                found = true;
                if(ans > (r-l-1)){
                    l_lim = l;
                    r_lim = r - 1;
                    ans = r-l-1;
                }
                char c = s.charAt(l);
                smap.put(c, smap.getOrDefault(c,1) - 1);
                if(smap.get(c) == 0)
                    smap.remove(c);
                l++;    
            }
        }
        if(found)
            return s.substring(l_lim,r_lim+1);
        return "";
    }
    boolean equals(HashMap<Character,Integer> smap, HashMap<Character,Integer> tmap){
        for(char c: tmap.keySet()){
            if(!smap.containsKey(c))
                return false;
            if(smap.get(c) < tmap.get(c))
                return false;
        }
        return true;
    }
}
