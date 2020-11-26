/*
Problem name: 445. Add Two Numbers II
Problem link: https://leetcode.com/problems/add-two-numbers-ii/
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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        stack<int> s1,s2;
        ListNode* temp;
        int x,y,num=0,carry=0,rem=0;
        
        temp=l1;
        while(temp!=NULL){
            s1.push(temp->val);
            temp=temp->next;
        }
        temp=l2;
        while(temp!=NULL){
            s2.push(temp->val);
            temp=temp->next;
        }
        
        ListNode* ans=NULL;
        while(!s1.empty() || !s2.empty()){
            x=0;
            y=0;
            if(!s1.empty()){
                x=s1.top();
                s1.pop();
            }
            if(!s2.empty()){
                y=s2.top();
                s2.pop();
            }
            num=x+y+carry;
            carry=num/10;
            rem=num%10;
            
            ListNode* q=new ListNode(rem);
            q->next=ans;
            ans=q;
        }
        if(carry!=0){
            ListNode* q=new ListNode(carry);
            q->next=ans;
            ans=q;
        }
        return ans;
    }
};
