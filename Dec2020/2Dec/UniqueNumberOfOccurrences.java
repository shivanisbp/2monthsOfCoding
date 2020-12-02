/*
Problem Name: 1207. Unique Number of Occurrences
Problem Link: https://leetcode.com/problems/unique-number-of-occurrences/
*/
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(map.values());
        return set.size() == map.size();
    }
}
