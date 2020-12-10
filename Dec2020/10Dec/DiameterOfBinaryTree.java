/*
Problem Name: 543. Diameter of Binary Tree
Problem Link: https://leetcode.com/problems/diameter-of-binary-tree/
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
    int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max = 0;
        maxdepth(root);
        return max;
    }
    int maxdepth(TreeNode root){
        if(root == null)
            return 0;
        int l = maxdepth(root.left), r = maxdepth(root.right);
        max = Math.max(l+r, max);
        return Math.max(l,r) + 1;
    }
}
