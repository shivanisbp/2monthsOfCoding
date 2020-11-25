/*
Problem Name: Add Two Numbers II
Problem Link: https://leetcode.com/problems/add-two-numbers-ii/
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        while(l1 != null){
            list1.add(0, l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            list2.add(0, l2.val);
            l2 = l2.next;
        }
        List<Integer> ans = new ArrayList<Integer>();
        int size1 = list1.size(), size2 = list2.size(), n = Math.max(size1,size2), carry = 0;
        for(int i=0;i<n;i++){
            int sum = carry;
            if(i < size1)
                sum += list1.get(i);
            if(i < size2)
                sum += list2.get(i);
            ans.add(sum%10);
            carry = sum/10;
        }
        if(carry > 0)
            ans.add(carry);
        ListNode ansLL = new ListNode(-1), trav = ansLL;
        for(int i=ans.size()-1;i>=0;i--){
            trav.next = new ListNode(ans.get(i));
            trav = trav.next;
        }
        return ansLL.next;
    }
}
