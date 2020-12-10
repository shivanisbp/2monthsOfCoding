/*
Problem Name: 257. Binary Tree Paths
Problem Link: https://leetcode.com/problems/binary-tree-paths/
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
    List<String> ans;
    public List<String> binaryTreePaths(TreeNode root) {
        ans = new ArrayList<String>();
        traverse(root,"");
        return ans;
    }
    void traverse(TreeNode root,String path){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            if(path.length() > 2)
                ans.add(path.substring(2)+"->"+root.val);
            else
                ans.add(""+root.val);
        }
        traverse(root.left,path+"->"+root.val);
        traverse(root.right,path+"->"+root.val);
    }
}
