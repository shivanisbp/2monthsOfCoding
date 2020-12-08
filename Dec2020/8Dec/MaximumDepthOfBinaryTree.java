/*
Problem Name: 104. Maximum Depth of Binary Tree
Problem Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/
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
    int depth;
    public int maxDepth(TreeNode root) {
        depth = 0;
        traverse(root,0);
        return depth;
    }
    void traverse(TreeNode root, int d){
        if(root == null){
            depth = Math.max(depth,d);
            return;
        }
        traverse(root.left,d+1);
        traverse(root.right,d+1);
    }
}
