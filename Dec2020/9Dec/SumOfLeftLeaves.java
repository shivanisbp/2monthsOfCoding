/*
Problem Name: 404. Sum of Left Leaves
Problem Link: https://leetcode.com/problems/sum-of-left-leaves/
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
    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0;
        traverse(root,false);
        return sum;
    }
    void traverse(TreeNode root,boolean isleft){
        if(root == null)
            return;
        if((root.left == null) && (root.right == null) && isleft)
            sum += root.val;
        traverse(root.left,true);
        traverse(root.right,false);
    }
}
