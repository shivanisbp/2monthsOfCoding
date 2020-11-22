/*
Problem name: 1290. Convert Binary Number in a Linked List to Integer
Problem link: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
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
    int getDecimalValue(ListNode* head) {
        int decimal=0;
         while(head){
             decimal*= 2;
             if (head->val == 1){
                 decimal+=1;
             }
             head = head->next;
         }
         return decimal;
    }
};
