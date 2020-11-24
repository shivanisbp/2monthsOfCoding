/*
Problem name: 83. Remove Duplicates from Sorted List
Problem link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
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
    ListNode* deleteDuplicates(ListNode* head) {
        if(head==nullptr)    return head;
        ListNode * prev, *cur,*ext;
        prev=head;
        cur=head->next;
        while(cur!=nullptr){
            if(cur->val==prev->val){
                while(cur!=nullptr && cur->val==prev->val){
                    cur=cur->next;            
                }
                prev->next=cur;
            }
            prev=prev->next;
        }
        return head;
    }
};
