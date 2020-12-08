/*
Problem Name: 617. Merge Two Binary Trees
Problem Link: https://leetcode.com/problems/merge-two-binary-trees/
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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return traverse(t1,t2);
    }
    static TreeNode traverse(TreeNode t1,TreeNode t2){
        if((t1 == null))
            return t2;
        if((t2 == null))
            return t1;
        t1.val += t2.val;
        t1.left = traverse(t1.left,t2.left);
        t1.right = traverse(t1.right,t2.right);
        return t1;
    }
}
