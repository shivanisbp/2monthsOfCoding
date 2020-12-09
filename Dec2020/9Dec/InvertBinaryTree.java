/*
Problem Name: 226. Invert Binary Tree
Problem Link: https://leetcode.com/problems/invert-binary-tree/
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
    public TreeNode invertTree(TreeNode root) {
        return invert(root);
    }
    TreeNode invert(TreeNode root){
        if(root == null)
            return null;
        TreeNode r = invert(root.right), l = invert(root.left);
        root.left = r;
        root.right = l;
        return root;
    }
}
