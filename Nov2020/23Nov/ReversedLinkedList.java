/*
Problem Name: Reversed Linked List
Problem Link: https://www.hackerearth.com/practice/data-structures/linked-list/singly-linked-list/practice-problems/algorithm/reversed-linked-list-01b722df/
*/
import java.util.*;
class ReversedLinkedList {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node head = new Node(-1,null);
        Node cur = head;
        for(int i=0;i<n;i++){
            cur.next = new Node(in.nextInt());
            cur = cur.next;
        }
        cur.next = new Node(-1);
        cur = head;
        Node prev = head, evenStart = null, evenEnd = null;
        while(cur != null){
            if(cur.val%2 == 0){
                if(evenStart == null)
                    evenStart = cur;
                evenEnd = cur;
            }
            else if(evenStart != null){
                evenEnd.next = null;
                evenStart = reverse(evenStart);
                evenEnd = evenEnd;
                while(evenEnd.next != null)
                    evenEnd = evenEnd.next;
                prev.next = evenStart;
                evenEnd.next = cur;
                evenStart = null;
                evenEnd = null;
                prev = cur;
            }
            else
                prev = cur;
            cur = cur.next;
        }

        cur = head;
        while(cur != null){
            if(cur.val != -1)
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
    }
    static Node reverse(Node head){ 
        Node prev = null;     
        Node curr = head; 
        while(curr != null){ 
            Node next = curr.next; 
            curr.next = prev; 
            prev = curr; 
            curr = next; 
        } 
        return prev; 
    } 
    static class Node{
        int val;
        Node next;
        Node(int v){
            val = v;
            next = null;
        }
        Node(int v,Node n){
            val = v;
            next = n;
        }
    }
}
