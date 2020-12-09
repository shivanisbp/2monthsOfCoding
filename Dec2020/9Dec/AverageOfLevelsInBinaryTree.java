/*
Problem Name: 637. Average of Levels in Binary Tree
Problem Link: https://leetcode.com/problems/average-of-levels-in-binary-tree/
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<Double>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        q.add(null);
        double sum = 0, cnt = 0;
        while(!q.isEmpty()){
            TreeNode t = q.remove();
            if(t == null){
                if(q.peek() == null)
                    break;
                else{
                    ans.add(sum/cnt);
                    sum = 0;
                    cnt = 0;
                    q.add(null);
                }
            }
            else{
                sum += t.val;
                cnt++;
                if(t.left != null)
                    q.add(t.left);
                if(t.right != null)
                    q.add(t.right);
            }
        }
        ans.add(sum/cnt);
        return ans;
    }
}
