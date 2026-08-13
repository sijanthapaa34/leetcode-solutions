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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode c = dummy;
        ListNode a = head;
        if(a== null || a.next== null) return head;
        ListNode b = a.next;
        while(a!= null&& a.next!= null){
            c.next = b;
            a.next = b.next;
            b.next = a;
            c = a;
            if(a.next!= null)a = a.next;
            if(a.next!= null)b = a.next;
        }
        return dummy.next;
    }
}