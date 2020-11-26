/*
Problem name: Inserting a Node Into a Sorted Doubly Linked List
Problem link: https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem
*/

// Complete the sortedInsert function below.

/*
 * For your reference:
 *
 * DoublyLinkedListNode {
 *     int data;
 *     DoublyLinkedListNode* next;
 *     DoublyLinkedListNode* prev;
 * };
 *
 */
DoublyLinkedListNode* sortedInsert(DoublyLinkedListNode* head, int data) {
    if(head == NULL)
        return new DoublyLinkedListNode(data);
    if(data < head->data){
        DoublyLinkedListNode* n=new DoublyLinkedListNode(data);
        n->next = head;
        head->prev = n;
        head = n;
        return head;
    }
    DoublyLinkedListNode* pre=head;
    DoublyLinkedListNode* cur=head->next;;
    while(cur != NULL && cur->data < data){
        pre = cur;
        cur = cur->next;
    }
    DoublyLinkedListNode* n=new DoublyLinkedListNode(data);
    if(cur == NULL){
        pre->next=n;
        n->next=NULL;
    }
    else{
        pre->next=n;
        n->prev=pre;
        n->next=cur;
        cur->prev=n;
    }
    return head;
}
