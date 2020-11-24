/*
Problem name: 817. Linked List Components
Problem link: https://leetcode.com/problems/linked-list-components/
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
    int numComponents(ListNode* head, vector<int>& G) {
        int count=0;
        ListNode* curr=head;
        
        set<int>s(G.begin(),G.end());
        
        while(curr!=nullptr){
            if(s.count(curr->val)){
                count++;
                while(curr!=nullptr && s.count(curr->val)){
                    curr=curr->next;
                }
            }
            else{
                curr=curr->next;
            }
        }
        return count;
    }
};
