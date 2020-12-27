/*
Problem Name: 1403. Minimum Subsequence in Non-Increasing Order
Problem Link: https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/
*/
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int ele: nums)
            sum += ele;
        List<Integer> list = new ArrayList<Integer>();
        int revsum = 0;
        for(int i=nums.length-1;i>=0;i--){
            revsum += nums[i];
            sum -= nums[i];
            list.add(nums[i]);
            if(revsum > sum){
                break;
            }
        }
        return list;
    }
}
