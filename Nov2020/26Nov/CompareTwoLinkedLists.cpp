/*
Problem name: Compare two linked lists
Problem link: https://www.hackerrank.com/challenges/compare-two-linked-lists/problem
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
bool compare_lists(SinglyLinkedListNode* head1, SinglyLinkedListNode* head2) {
    bool comp=true;
    while(head1 || head2){
        if((head1 && !head2) || (!head1 && head2) || (head1->data != head2->data)){
            comp=false;
            break;
        }  
        head1=head1->next;
        head2=head2->next;
    }
    return comp;
}
