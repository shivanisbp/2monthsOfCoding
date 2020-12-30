/*
Problem Name: 661. Image Smoother
Problem Link: https://leetcode.com/problems/relative-ranks/
*/
class Solution {
    public String[] findRelativeRanks(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>(Collections.reverseOrder());
        int n = nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        String ans[] = new String[nums.length];
        Iterator<Integer> itr = map.keySet().iterator(); 
        if(n >= 1)
            ans[map.get(itr.next())] = "Gold Medal";
        if(n >= 2)
            ans[map.get(itr.next())] = "Silver Medal";
        if(n >= 3)
            ans[map.get(itr.next())] = "Bronze Medal";
        for(int i=3;i<n;i++){
            ans[map.get(itr.next())] = (i+1) + "";
        }
        return ans;
    }
}
