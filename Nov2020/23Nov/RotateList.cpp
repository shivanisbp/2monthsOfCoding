/*
Problem name: 61. Rotate List
Problem link: https://leetcode.com/problems/rotate-list/
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
    ListNode* rotateRight(ListNode* head, int k) {
        if(head==nullptr || head->next==nullptr)    return head;
        ListNode *l1=head,*l2;
        int len=1;
        while(l1->next!=nullptr){
            len++;
            l1=l1->next;
        }
        k=len-(k%len);
        l1=head;
        while(--k){
            l1=l1->next;
        }
        l2=l1;
        while(l2->next!=nullptr){
            l2=l2->next;
        }
        l2->next=head;
        head=l1->next;
        l1->next=nullptr;
        return head;
    }
};
