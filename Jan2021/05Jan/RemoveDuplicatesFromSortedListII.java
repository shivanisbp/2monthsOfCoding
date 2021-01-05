/*
Problem Name: 82. Remove Duplicates from Sorted List II
Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
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
        if(head == null)
            return head;
        ListNode ancestor = new ListNode(-1, head), prev = ancestor;
        while(head != null){
            if(head.next != null && head.val == head.next.val){
                while(head.next != null && head.val == head.next.val)
                    head = head.next;
                prev.next = head.next;
            }
            else
                prev = prev.next;
            head = head.next;
        }
        return ancestor.next;
    }
}
