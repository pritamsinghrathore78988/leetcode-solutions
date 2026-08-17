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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right) return head;
        //count the number of 
        ListNode nn=head;

        ListNode prev=head;
        ListNode righ=head;
        int nodes=0;
        while(nn!=null){nn=nn.next;nodes++;}
        // nodes are now number of nodes
        nn=head;
        ListNode nnkepahle=head;
        for(int i=1;i<left;i++){
           prev=nn;
           nn=nn.next;
        //we reached from where we need to start turning the nodes
        }
        righ=nn;
        for(int i=left;i<=right;i++){
            righ=righ.next;
        }
        nnkepahle=nn;
        // nn=nn.next;
        ListNode preev=righ;
        ListNode curr=nn;
        while(curr!=righ){
           ListNode nextnode=curr.next;
            curr.next=preev;
            preev=curr;
            curr=nextnode;
        }
        if(left==1 )head=preev;
        else prev.next=preev;
        // nnkepahle.next=righ;
        // System.out.println("nodes: "+nodes);
      return head;
    }
}