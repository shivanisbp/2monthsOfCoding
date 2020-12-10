/*
Problem Name: 669. Trim a Binary Search Tree
Problem Link: https://leetcode.com/problems/trim-a-binary-search-tree/
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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        return traverse(root, low, high);
    }
    TreeNode traverse(TreeNode root, int l, int h){
        if(root == null)
            return root;
        if(root.val > h)
            return traverse(root.left, l, h);
        if(root.val < l)
            return traverse(root.right, l, h);
        root.left = traverse(root.left, l, h);
        root.right = traverse(root.right, l, h);
        return root;  
    }
}
