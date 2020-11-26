/*
Problem Name: Inserting a Node Into a Sorted Doubly Linked List
Problem Link: https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem
*/
// This file contains only the function which needs to be edited

/*
* For your reference:
*
* DoublyLinkedListNode {
*     int data;
*     DoublyLinkedListNode next;
*     DoublyLinkedListNode prev;
* }
*
*/
static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
  if(head == null)
    return new DoublyLinkedListNode(data);
  if(data <= head.data){
    DoublyLinkedListNode node = new DoublyLinkedListNode(data);
    node.next = head;
    head.prev = node;
    return node;
  }
  DoublyLinkedListNode prev = null, temp = head;
  boolean inserted = false;
  while(temp != null){
    if(data <= temp.data){
      DoublyLinkedListNode node = new DoublyLinkedListNode(data);
      node.next = temp;
      node.prev = temp.prev;
      temp.prev = node;
      node.prev.next = node;
      inserted = true;
      break;
    }
    prev = temp;
    temp = temp.next;
  }
  if(!inserted){
    prev.next = new DoublyLinkedListNode(data);
    prev.next.prev = prev;
  }
  return head;
}
