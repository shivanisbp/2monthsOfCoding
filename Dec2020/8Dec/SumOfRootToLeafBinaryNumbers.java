/*
Problem Name: 1022. Sum of Root To Leaf Binary Numbers
Problem Link: https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
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
    public int sumRootToLeaf(TreeNode root) {
        sum = 0;
        traverse(root,0);
        return sum;
    }
    void traverse(TreeNode root, int num){
        if(root == null){
            return;
        }
        num = num*2;
        num += root.val;
        if((root.left == null) && (root.right == null))
            sum += num;
        traverse(root.left,num);
        traverse(root.right,num);
    }
}
