/*
Problem Name: 61. Rotate List
Problem Link: https://leetcode.com/problems/rotate-list/
*/
/* Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return null;
        int cnt = 0;
        ListNode temp = head, prev = null, end = null;
        while(temp != null){
            cnt++;
            end = temp;
            temp = temp.next;
        }
        k = k%cnt;
        if(k==0)
            return head;
        k = cnt - k;
        temp = head;
        while(k > 0){
            prev = temp;
            temp = temp.next;
            k--;
        }
        
        end.next = head;
        prev.next = null;
        
        return temp;
    }
}
