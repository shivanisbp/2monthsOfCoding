/*
Problem Name: 496. Next Greater Element I
Problem Link: https://leetcode.com/problems/next-greater-element-i/
*/
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() && st.peek() < nums2[i])
                map.put(st.pop(), nums2[i]);
            st.push(nums2[i]);
        }
        
        int ans[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            if(map.keySet().contains(nums1[i]))
                ans[i] = map.get(nums1[i]);
            else
                ans[i] = -1;
        }
        return ans;
    }
}
