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
    public ListNode reverseList(ListNode head) {
        // brute force
        // ArrayList<ListNode> arr = new ArrayList<>();
        // ListNode temp = head;
        // if(head == null) return head;
        // while(temp!= null){
        //     arr.add(temp);
        //     temp = temp.next;
        // }

        // int n = arr.size();
        // for(int i = n-1; i>0;i--){
        //     arr.get(i).next = arr.get(i-1);
        // }
        // arr.get(0).next = null;

        // return arr.get(n-1);

        // pointer 
        // ListNode prev = null;
        // ListNode curr = head;
        // ListNode fwd = null;

        // while(curr!= null){
        //     fwd = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = fwd;
        // }
        // return prev;

        // recursion
        if(head == null || head.next == null) return head;
        ListNode a = head.next;
        head.next = null;
        ListNode b = reverseList(a);
        a.next = head;
        return b;
    }
}