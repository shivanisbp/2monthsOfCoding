/*
Problem Name: 599. Minimum Index Sum of Two Lists
Problem Link: https://leetcode.com/problems/minimum-index-sum-of-two-lists/
*/
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map1 = new HashMap<String,Integer>();
        HashMap<String,Integer> map2 = new HashMap<String,Integer>();
        for(int i=0;i<list1.length;i++)
            map1.put(list1[i],i);
        for(int i=0;i<list2.length;i++)
            map2.put(list2[i],i);
        HashMap<String,Integer> common = new HashMap<String,Integer>();
        int min = Integer.MAX_VALUE;
        for(String s:map1.keySet()){
            if(map2.containsKey(s)){
                common.put(s, map1.get(s) + map2.get(s));
                min = Math.min(min, common.get(s));
            }
        }
        List<String> ans = new ArrayList<String>();
        for(String s:common.keySet()){
            if(common.get(s) == min)
                ans.add(s);
        }
        String sans[] = new String[ans.size()];
        for(int i=0;i<sans.length;i++)
            sans[i] = ans.get(i);
        return sans;
    }
}
