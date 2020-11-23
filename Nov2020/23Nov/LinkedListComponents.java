/*
Problem Name: 817. Linked List Components
Problem Link: https://leetcode.com/problems/linked-list-components/
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
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i: G)
            set.add(i);
        int cnt = 0, cur = 0;
        while(head != null){
            if(set.contains(head.val))
                cur++;
            else{
                if(cur > 0)
                    cnt++;
                cur = 0;
            }
            head = head.next;
        }
        if(cur > 0)
            cnt++;
        return cnt;
    }
}
