/*
Problem Name: 83. Remove Duplicates from Sorted List
Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = head, cur = head;
        while(cur != null){
            int curval = cur.val;
            while(cur != null && (cur.val == curval))
                cur = cur.next;
            prev.next = cur;
            prev = cur;
        }
        return head;
    }
}
