/*
Problem Name: Print in Reverse
Problem Link: https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem
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
static void reversePrint(SinglyLinkedListNode head) {
    if(head == null)
        return;
    reversePrint(head.next);
    System.out.println(head.data);
}
