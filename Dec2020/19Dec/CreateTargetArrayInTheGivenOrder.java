/*
Problem Name: 1389. Create Target Array in the Given Order
Problem Link: https://leetcode.com/problems/create-target-array-in-the-given-order/
*/
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        List<Integer> list = new ArrayList<Integer>(n);
        for(int i=0;i<n;i++)
            list.add(index[i], nums[i]);
        int target[] = new int[n];
        for(int i=0;i<n;i++)
            target[i] = list.get(i);
        return target;
    }
}
