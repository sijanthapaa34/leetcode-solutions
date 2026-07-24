/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int nA = length(headA);
        int nB = length(headB);
        if(nB==nA){
            return find(headA, headB);
        }else if(nA>nB){
            ListNode newA = skip(headA, nA-nB);
            return find(newA, headB);
        }else{
            ListNode newB = skip(headB, nB-nA);
            return find(headA, newB);
        }
    }
    public ListNode find(ListNode headA, ListNode headB){
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != null){
            if(temp1 == temp2) return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
    public ListNode skip(ListNode head, int k){
        ListNode temp = head;
        for(int i = 1; i<= k; i++){
            temp = temp.next;
        }
        return temp;
    }
    public int length(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}