/*
Problem Name: 1290. Convert Binary Number in a Linked List to Integer
Problem Link: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
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
    public int getDecimalValue(ListNode head) {
        int num = 0;
        while(head != null){
            num <<= 1;
            if(head.val == 1)
                num += 1;
            head = head.next;
        }
        return num;
    }
}
