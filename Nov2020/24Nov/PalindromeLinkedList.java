/*
Problem Name: 234. Palindrome Linked List
Problem Link: https://leetcode.com/problems/palindrome-linked-list/
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
    public boolean isPalindrome(ListNode head) {
        if((head == null) || (head.next == null))
            return true;
        ListNode slow = head, fast = head;
        while((fast != null) && (fast.next != null)){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverse(slow);
        fast = head;
        while(slow != null){
            if(slow.val != fast.val)
                return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    static ListNode reverse(ListNode head){
        ListNode prev = null, next = null, cur = head;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
