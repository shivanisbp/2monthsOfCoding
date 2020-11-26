/*
Problem Name: 109. Convert Sorted List to Binary Search Tree
Problem Link: https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
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
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> l = new ArrayList<Integer>();
        while(head != null){
            l.add(head.val);
            head = head.next;
        }
        return build(l, 0, l.size()-1);
    }
    static TreeNode build(List<Integer> list, int l, int r){
        if(l > r)
            return null;
        if(l == r)
            return new TreeNode(list.get(l));
        int mid = (l+r)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = build(list, l, mid-1);
        root.right = build(list, mid+1, r);
        return root;
    }
}
