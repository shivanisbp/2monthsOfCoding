/*
Problem name: 1019. Next Greater Node In Linked List
Problem link: https://leetcode.com/problems/next-greater-node-in-linked-list/
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
    vector<int> nextLargerNodes(ListNode* head) {
        ListNode* cur = head;
        int len=0,i=0;
        while(cur != NULL){
            cur=cur->next;
            len++;
        }
        
        vector<int> ans(len,0);
        stack<pair<int,int>> s;
        
        cur=head;
        while(cur != NULL)
        {
            while(!s.empty() && cur->val > s.top().first)
            {
                ans[s.top().second] = cur->val;
                s.pop();
            }
            s.push(make_pair(cur->val, i));

            cur = cur->next;
            i++;
        }
        
        return ans;
    }
};
