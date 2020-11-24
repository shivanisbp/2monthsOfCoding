/*
Problem name: 234. Palindrome Linked List
Problem link: https://leetcode.com/problems/palindrome-linked-list/
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
    bool isPalindrome(ListNode* head) {
        if(head==nullptr || head->next==nullptr)    return true;
        stack<int>s;
        ListNode *pt1=head;
        while(pt1->next!=nullptr){
            s.push(pt1->val);
            pt1=pt1->next;
        }
        s.push(pt1->val);
        pt1=head;
        while(pt1->next!=nullptr){
            if(pt1->val!=s.top()){
                return false;
            }
            s.pop();
            pt1=pt1->next;
        }
        return true;
    }
};
