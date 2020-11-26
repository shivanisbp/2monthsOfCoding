/*
Problem name: 430. Flatten a Multilevel Doubly Linked List
Problem link: https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
*/

/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* prev;
    Node* next;
    Node* child;
};
*/

class Solution {
public:
    Node* flatten(Node* head) {
        Node* temp;
        temp=head;
        stack<Node*> s;
        while(temp!=NULL){
            if(temp->child!=NULL){
                if(temp->next!=NULL)
                    s.push(temp->next);
                temp->child->prev=temp;
                temp->next=temp->child;
                temp->child=NULL;
            }
            if(temp->next!=NULL){
                temp=temp->next;
            }
            else if(!s.empty()){
                temp->next=s.top();
                s.pop();
                temp->next->prev=temp;
                temp=temp->next;
            }
            else{
                temp->next=NULL;
                temp=temp->next;
            }
        }
        return head;
    }
};
