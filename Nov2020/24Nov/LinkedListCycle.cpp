/*
Problem name: 141. Linked List Cycle
Problem link: https://leetcode.com/problems/linked-list-cycle/
*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        ListNode *fast=new ListNode;
        ListNode *slow=new ListNode;
        fast=head;
        slow=head;
        
        while(slow!=nullptr && fast!=nullptr && fast->next!=nullptr){
            fast=fast->next->next;
            slow=slow->next;
            if(slow == fast)  return true; 
        }
        return false;
    }
};
