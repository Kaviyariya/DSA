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
        if(head==null || head.next==null){
            return head;
        }
        if(k==0) return head;
        ListNode temp=head;
        int len=1;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        k=k%len;
        temp.next=head;
        ListNode dummy=head;
        for(int i=0;i<len-k-1;i++){
           dummy=dummy.next;
        }
        ListNode ans=dummy.next;
        dummy.next=null;
        return ans;
    }
}