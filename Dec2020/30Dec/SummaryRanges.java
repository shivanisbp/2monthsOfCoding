/*
Problem Name: 228. Summary Ranges
Problem Link: https://leetcode.com/problems/summary-ranges/
*/
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        if(nums.length == 0)
            return list;
        int last = nums[0], n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i] != nums[i-1] + 1){
                if(last == nums[i-1])
                    list.add(last + "");
                else
                    list.add(last + "->" + nums[i-1]);
                last = nums[i];
            }
        }
        if(last == nums[n-1])
            list.add(last + "");
        else
            list.add(last + "->" + nums[n-1]);
        return list;
    }
}
