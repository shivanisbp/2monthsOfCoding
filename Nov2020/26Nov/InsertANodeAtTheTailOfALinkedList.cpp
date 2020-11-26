/*
Problem name: Insert a Node at the Tail of a Linked List
Problem link: https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem
*/

// Complete the insertNodeAtTail function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */
SinglyLinkedListNode* insertNodeAtTail(SinglyLinkedListNode* head, int data) {
    SinglyLinkedListNode* node = new SinglyLinkedListNode(data);
    if(head == NULL) return node;
    
    SinglyLinkedListNode* temp=head;
    while(temp ->next != NULL){
        temp=temp->next;
    }
    
    temp->next = node;
    return head;
}
