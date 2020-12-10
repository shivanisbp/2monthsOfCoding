/*
Problem Name: 563. Binary Tree Tilt
Problem Link: https://leetcode.com/problems/binary-tree-tilt/
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
    int sum;
    public int findTilt(TreeNode root) {
        sum = 0;
        traverse(root);
        return sum;
    }
    int traverse(TreeNode root){
        if(root == null)
            return 0;
        int l = traverse(root.left);
        int r = traverse(root.right);
        sum += Math.abs(l - r);
        return root.val + l + r;                
    }
}
