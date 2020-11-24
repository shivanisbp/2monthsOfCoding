/*
Problem Name: 21. Merge Two Sorted Lists
Problem Link: https://leetcode.com/problems/merge-two-sorted-lists/
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1), trav = head;
        while((l1 != null) && (l2 != null)){
            if(l1.val < l2.val){
                trav.next = l1;
                trav = trav.next;
                l1 = l1.next;
            }
            else{
                trav.next = l2;
                trav = trav.next;
                l2 = l2.next;
            }
        }    
        while(l1 != null){
            trav.next = l1;
            trav = trav.next;
            l1 = l1.next;
        }
        while(l2 != null){
            trav.next = l2;
            trav = trav.next;
            l2 = l2.next;
        }
        return head.next;
    }
}
