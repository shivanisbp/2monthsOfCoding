/*
Problem name: Print in reverse
Problem link: https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem
*/

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */
void reversePrint(SinglyLinkedListNode* head) {
    SinglyLinkedListNode* temp = head;
    stack<int> s;
    while(temp){
        s.push(temp->data);
        temp=temp->next;
    }
    while(!s.empty()){
        cout<<s.top()<<"\n";
        s.pop();
    }

}
