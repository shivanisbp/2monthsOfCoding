/*
Problem Name: 1431. Kids With the Greatest Number of Candies
Problem Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
*/
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int x: candies)
            max = Math.max(max,x);
        List<Boolean> ans = new ArrayList<Boolean>();
        for(int x: candies){
            if(x + extraCandies >= max)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}
