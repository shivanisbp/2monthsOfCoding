/*
Problem Name: 328. Odd Even Linked List
Problem Link: https://leetcode.com/problems/odd-even-linked-list/
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
    public ListNode oddEvenList(ListNode head) {
        int parity = 0;
        ListNode odd = new ListNode(-1), even = new ListNode(-1), oddTrav = odd, evenTrav = even;
        while(head != null){
            if(parity%2 == 0){
                evenTrav.next = head;
                evenTrav = evenTrav.next;
            }
            else{
                oddTrav.next = head;
                oddTrav = oddTrav.next;
            }
            parity++;
            head = head.next;
        }
        evenTrav.next = odd.next;
        oddTrav.next = null;
        return even.next;
    }
}
