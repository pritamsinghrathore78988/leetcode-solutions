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
    public ListNode rotateRight(ListNode head, int k) {
     //   first we will count the number of nodes list
     ListNode nn=head;
     int n=0,t=0;
     if(nn==null) return head; 
     while(nn!=null){n++;nn=nn.next;}
     //System.out.println("The Number of noeds : "+n);
     
     if(k%n==0){
        return head;
     }
     else {
      t=k%n;
     }
     nn=head;
     ListNode nextnode=head;
     for(int i=0;i<t;i++){
     while(nextnode.next!=null){
        nn=nextnode;
        nextnode=nextnode.next;
     }
     nn.next=null;
     nextnode.next=head;
     head=nextnode;
     }
     return head;
    }
}