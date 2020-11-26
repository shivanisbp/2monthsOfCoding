/*
Problem name: 725. Split Linked List in Parts
Problem link: https://leetcode.com/problems/split-linked-list-in-parts/
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
    vector<ListNode*> splitListToParts(ListNode* root, int k) {
        vector<ListNode*> ans;
        ListNode* temp = root;
        int n = 0, i = 0, j = 0;
        
        while(temp != nullptr){
            n++;
            temp=temp->next;
        }
        
        while(i < k){
            j = 0;
            temp = root;
            ans.push_back(temp);
            if(i < n % k){
                while(j < (n/k)){
                    if(temp != NULL)
                        temp=temp->next;
                    j++;
                }
            }
            else{
                while(j < (n/k)-1){
                    if(temp != NULL)
                        temp=temp->next;
                    j++;
                }
            }
            
            if(temp != NULL){
                root=temp->next;
                temp->next=NULL;
            } 
            i++;
        }
        return ans;
    }
};
