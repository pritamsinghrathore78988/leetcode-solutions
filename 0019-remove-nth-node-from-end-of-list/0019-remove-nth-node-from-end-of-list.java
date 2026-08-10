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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null)
        return null;
        // count total number of nodes
        ListNode nn=head;
        int p=0;
        while(nn!=null){
            p++;
            nn=nn.next;
        }
        if(p==n)//number of nodes=n , it simply means deleting first node
        {
       head=head.next;
       return head;

        }
        // System.out.println(" number of nodes "+p);
        int dltfromfirst=p-n;
        ListNode beforedlt=head;
        ListNode dlt=head;

        while(dltfromfirst!=0){
            beforedlt=dlt;
            dlt=dlt.next;
            dltfromfirst--;
        }
        beforedlt.next=dlt.next;
        return head;
    }
}