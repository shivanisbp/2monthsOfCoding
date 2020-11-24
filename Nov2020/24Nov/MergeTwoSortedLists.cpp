/*
Problem name: 21. Merge Two Sorted Lists
Problem link: https://leetcode.com/problems/merge-two-sorted-lists/
*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        if(l1==nullptr) return l2;
        if(l2==nullptr) return l1;
        
        ListNode* head=new ListNode;
        if(l1->val > l2->val){
            head=l2;
            l2=l2->next;
        } 
        else{
            head=l1;
            l1=l1->next;
        }    
        
        ListNode* t=new ListNode;
        t=head;
        while(l1!=nullptr && l2!=nullptr){
            if(l1->val < l2->val){
                t->next=l1;
                l1=l1->next;
            }
            else{
                t->next=l2;
                l2=l2->next;
            }
            t=t->next;
        }
        while(l1){
            t->next=l1;
            t=t->next;
            l1=l1->next;
        }
        while(l2){
            t->next=l2;
            t=t->next;
            l2=l2->next;
        }
        return head;
    }
};
