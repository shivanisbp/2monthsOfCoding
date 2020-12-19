/*
Problem Name: 1313. Decompress Run-Length Encoded List
Problem Link: https://leetcode.com/problems/decompress-run-length-encoded-list/
*/
class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int n = nums.length;
        for(int i=0;i<n;i+=2){
            for(int j=0;j<nums[i];j++)
                list.add(nums[i+1]);
        }
        n = list.size();
        int ans[] = new int[n];
        for(int i=0;i<n;i++)
            ans[i] = list.get(i);
        return ans;
    }
}
