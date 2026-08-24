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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode prev=head;
        ListNode curr;
        curr=prev.next;
        while(curr!=null){
            if(prev.val==curr.val){
                prev.next=curr.next;// shi h
                // curr.next=null;
                // prev=prev.next;
                curr=prev.next;
            }
            else{ 
            // curr=curr.next;
            prev=curr;
            curr=curr.next;}
        }
        return head;
    }
}