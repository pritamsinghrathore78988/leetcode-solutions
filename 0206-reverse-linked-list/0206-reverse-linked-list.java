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
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        else{
            ListNode a,b,c;
            a=head;
            b=head.next;
            while(b!=null){
                c=b.next;
                b.next=a;
                // update
                a=b;
                b=c;
            }
            head.next=null;
            head=a;
         return head;
        }
    }
}