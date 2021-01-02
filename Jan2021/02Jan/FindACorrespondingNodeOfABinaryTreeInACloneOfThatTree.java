/*
Problem Name: 1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
Problem Link: https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    static TreeNode reference;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        int val = target.val;
        reference = new TreeNode(-1);
        find(cloned, val);
        return reference;
    }
    static void find(TreeNode root,int v){
        if(root == null)
            return;
        if(root.val == v){
            reference = root;
            return;
        }
        if(reference.val == -1)
            find(root.left, v);
        if(reference.val == -1)
            find(root.right, v);
    }
}
