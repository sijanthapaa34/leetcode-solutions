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
    public boolean isPalindrome(ListNode head) {
        // ArrayList<Integer> arr = new ArrayList<>();
        // ListNode temp = head;
        // if(head == null) return false;
        // while(temp!= null){
        //     arr.add(temp.val);
        //     temp = temp.next;
        // }

        // int i = 0, j = arr.size()-1;
        // while(i<j){
        //     if(arr.get(i) != arr.get(j)){ return false;}
        //     i++;
        //     j--;
        // }
        // return true;
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!= null && fast.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = reverse(slow.next);
        slow.next = null;
        ListNode temp = head;
        while(temp!= null && head2!= null){
            if(temp.val != head2.val) return false;
            temp = temp.next;
            head2 = head2.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}