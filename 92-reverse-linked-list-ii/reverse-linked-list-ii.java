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
    static ListNode reverse(ListNode head){
    ListNode prev = null;
    ListNode curr = head;

    while(curr != null ){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    return prev;
}
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode a = dummy;
    for (int i = 1; i < left; i++) {
        a = a.next;
    }
    ListNode c = dummy;
    ListNode b=a.next;
    a.next=null;
    ListNode rev=b;
    for(int i=left;i<right;i++){
        b=b.next;
    }
    c=b.next;
    b.next=null;
    b=reverse(rev);
    a.next=b;
    while(b.next!=null){
        b=b.next;
    }
    b.next=c;
    return dummy.next;
    }
}