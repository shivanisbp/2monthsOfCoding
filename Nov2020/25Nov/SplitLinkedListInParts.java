/*
Problem Name: 725. Split Linked List in Parts
Problem Link: https://leetcode.com/problems/split-linked-list-in-parts/
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode ans[] = new ListNode[k];
        ListNode temp = root;
        int cnt = 0;
        while(temp != null){
            temp = temp.next;
            cnt++;
        }
        int cntarr[] = new int[k];
        Arrays.fill(cntarr,cnt/k);
        cnt = cnt%k;
        for(int i=0;cnt>0;i++, cnt--)
            cntarr[i]++;
        
        //for(int i=0;i<k;i++)
        //    System.out.print(cntarr[i]+" ");
        
        ans[0] = root;
        int ind = 0;
        while(root != null){
            cntarr[ind]--;
            if(cntarr[ind] <= 0){
                temp = root.next;
                root.next = null;
                root = temp;
                ind++;
                if(ind<k)
                    ans[ind] = root;
            }
            else
                root = root.next;
        }
        
        return ans;
    }
}
