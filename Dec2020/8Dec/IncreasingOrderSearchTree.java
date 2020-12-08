/*
Problem Name: 897. Increasing Order Search Tree
Problem Link: https://leetcode.com/problems/increasing-order-search-tree/
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
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        inorder(root,list);
        list.get(0).left = null;
        list.get(list.size()-1).left = null;
        list.get(list.size()-1).right = null;
        for(int i=1;i<list.size();i++){
            list.get(i).left = null;
            list.get(i-1).right = list.get(i);
        }
        return list.get(0);
    }
    static void inorder(TreeNode root,List<TreeNode> list){
        if(root == null)
            return;
        inorder(root.left,list);
        list.add(root);
        inorder(root.right,list);
    }
}
