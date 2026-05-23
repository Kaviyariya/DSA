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
        if(head==null||head.next==null){
            return head;
        }
        ListNode tail=head;
        ListNode temp=head;
        int count=1;
        while(tail.next!=null){
            count++;
            tail=tail.next;
        }
        k=k%count;
        if(k==0){
            return head;
        }
        tail.next=head;
        for(int i=0;i<count-k-1;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}