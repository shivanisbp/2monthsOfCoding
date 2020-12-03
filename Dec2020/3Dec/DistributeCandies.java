/*
Problem Name: 575. Distribute Candies
Problem Link: https://leetcode.com/problems/distribute-candies/
*/
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<candyType.length;i++)
            set.add(candyType[i]);
        return Math.min(candyType.length/2,set.size());
    }
}
