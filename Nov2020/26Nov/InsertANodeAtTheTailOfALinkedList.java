/*
Problem Name: Insert a Node at the Tail of a Linked List
Problem Link: https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem
*/
// This file contains only the function which needs to be edited

/*
* For your reference:
*
* SinglyLinkedListNode {
*     int data;
*     SinglyLinkedListNode next;
* }
*
*/
static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
  if(head == null)
    return new SinglyLinkedListNode(data);
  SinglyLinkedListNode temp = head;
  while(temp.next != null)
    temp = temp.next;
  temp.next = new SinglyLinkedListNode(data);
  return head;
}
