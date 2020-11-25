/*
Problem name: 328. Odd Even Linked List
Problem link: https://leetcode.com/problems/odd-even-linked-list/
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
    ListNode* oddEvenList(ListNode* head) {
        
        if(head==NULL || head->next==NULL|| head->next->next==NULL)  return head;
        
        ListNode *odd,*even,*evenf;
        odd=head;
        even=head->next;
        evenf=head->next;
        
        while(even->next!=NULL){
            odd->next=even->next;
            odd=even->next;
            if(odd->next!=nullptr){
                even->next=odd->next;
                even=odd->next;
            }
            else{
                even->next=nullptr;
            }
            
        }
        odd->next=evenf;
      
        return head;
    }
};
