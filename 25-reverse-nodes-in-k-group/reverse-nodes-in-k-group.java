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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(-1);
        ListNode point=dummy;
        dummy.next=head;
        while(true){
            ListNode start=point.next;
            ListNode end=point;
            for(int i=1;i<=k;i++){
                end=end.next;
                if(end==null){
                    return dummy.next;
                }
            }
            ListNode ng=end.next;
            ListNode prev=ng;
            ListNode curr=start;
            while(curr!=ng){
                ListNode temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            point.next=end;
            point=start;
        }
    }
}