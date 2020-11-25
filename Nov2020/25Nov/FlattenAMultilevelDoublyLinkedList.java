/*
Problem Name: 430. Flatten a Multilevel Doubly Linked List
Problem Link: https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
*/
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        return flat(head);
    }
    static Node flat(Node head){
        Node temp = head;
        while(temp != null){
            if(temp.child != null){
                Node next = temp.next;
                temp.next = flat(temp.child);
                temp.child = null;
                if(temp.next != null)
                    temp.next.prev = temp;
                while(temp.next != null)
                    temp = temp.next;
                temp.next = next;
                if(next != null)
                    next.prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }
}
