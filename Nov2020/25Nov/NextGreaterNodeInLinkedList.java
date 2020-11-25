/*
Problem Name: 1019. Next Greater Node In Linked List
Problem Link: https://leetcode.com/problems/next-greater-node-in-linked-list/
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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        int n = 0;
        while(temp != null){
            temp = temp.next;
            n++;
        }
        int ans[] = new int[n], ele[] = new int[n];
        Stack<Integer> st = new Stack<Integer>();
        temp = head;
        n = 0;
        while(temp != null){
            if(st.isEmpty()){
                st.push(n);
                ele[n] = temp.val;
            }
            else{
                while(!st.isEmpty() && (ele[st.peek()] < temp.val)){
                    ans[st.pop()] = temp.val;
                }
                st.push(n);
                ele[n] = temp.val;
            }
            n++;
            temp = temp.next;
        }
        return ans;
    }
}
