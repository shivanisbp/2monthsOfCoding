/*
Problem Name: 160. Intersection of Two Linked Lists
Problem Link: https://leetcode.com/problems/intersection-of-two-linked-lists/
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA, ansNode = null;
        while(temp != null){
            temp.val *= -1;
            temp = temp.next;
        }
        temp = headB;
        while(temp != null){
            if(temp.val < 0){
                ansNode = temp;
                break;
            }
            temp = temp.next;
        }
        temp = headA;
        while(temp != null){
            temp.val *= -1;
            temp = temp.next;
        }
        
        return ansNode;
    }
}
