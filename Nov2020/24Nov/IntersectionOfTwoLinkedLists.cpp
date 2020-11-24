/*
Problem name: 160. Intersection of Two Linked Lists
Problem link: https://leetcode.com/problems/intersection-of-two-linked-lists/
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
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode *currA,*currB;
        int A=0,B=0;
        currA=headA;
        currB=headB;
        if(currA==nullptr || currB==nullptr)    return nullptr;
        while(currA->next!=nullptr){
            currA=currA->next;
            A++;
        } 
        while(currB->next!=nullptr){
            currB=currB->next;
            B++;
        }
        
        if(A>B){
            currA=headA;
            for(int i=0;i<A-B;++i) currA=currA->next;
            currB=headB;
        } 
        else if(B>A){
            currB=headB;
            for(int i=0;i<B-A;++i) currB=currB->next;
            currA=headA;
        }
        else{
            currA=headA;
            currB=headB;
        }
        
        while(currA!=currB){
            currA=currA->next;
            currB=currB->next;
        }
        return currA;
    }
};
