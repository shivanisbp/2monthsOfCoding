/*
Problem Name: 108. Convert Sorted Array to Binary Search Tree
Problem Link: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return create(nums, 0, nums.length-1);
    }
    static TreeNode create(int nums[], int l, int r){
        TreeNode root = null;
        if(l <= r){
            int mid = (l + r)/2;
            root = new TreeNode(nums[mid]);
            root.left = create(nums, l, mid-1);
            root.right = create(nums, mid+1, r);
        }
        return root;
    }
}
