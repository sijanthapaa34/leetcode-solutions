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
    public ListNode middleNode(ListNode head) {
        // int length = 0;
        // ListNode temp = head;
        // while(temp.next != null){
        //     length++;
        //     temp = temp.next;
        // }

        // int mid = 0;
        // if(length%2 == 0) mid = length/2;
        // else mid = (length/2) + 1;

        // temp = head;
        // for(int i = 0; i< mid; i++){
        //     temp = temp.next;
        // }

        // return temp;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}