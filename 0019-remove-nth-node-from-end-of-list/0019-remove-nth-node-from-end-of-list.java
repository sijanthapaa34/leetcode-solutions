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
    //     ListNode temp = head;
    //     int len = 0;
    //    while(temp != null){
    //         len++;
    //         temp = temp.next;
    //    }
    //    if(n==len) return head.next;
    //    temp = head;
    //    for(int i = 1; i< len-n;i++ ){
    //         temp = temp.next;
    //    }
    //    temp.next = temp.next.next;

    //    return head;
        ListNode fast = head;
        ListNode slow = head;

        for(int i = 1; i<= n; i++){
            fast = fast.next;
        }
        
        if(fast == null) return head.next;
        
        while(fast!= null && fast.next!= null ){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}