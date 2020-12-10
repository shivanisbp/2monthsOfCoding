/*
Problem Name: 993. Cousins in Binary Tree
Problem Link: https://leetcode.com/problems/cousins-in-binary-tree/
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
    String path1, path2;
    int d1, d2;
    public boolean isCousins(TreeNode root, int x, int y) {
        path1 = "";
        path2 = "";
        d1 = d2 = 0;
        depth(root, x, "", 0);
        d2 = d1;
        path2 = path1;
        depth(root, y, "", 0);
        return (d1 == d2) && !path1.equals(path2);
    }
    void depth(TreeNode root, int val, String p, int depth){
        if(root == null)
            return;
        if(root.val == val){
            path1 = p;
            d1 = depth;
            return;
        }
        depth(root.left, val, p+"|"+root.val, depth+1);
        depth(root.right, val, p+"|"+root.val, depth+1);
    }
}
