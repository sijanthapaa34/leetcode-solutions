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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int fr = 0, fc = 0, lr = m-1, lc = n-1;
        int[][] ans = new int[m][n];
        int c = 0;
        ListNode temp =  head;


        for (int[] row : ans) {
            Arrays.fill(row, -1);
        }
        while (fr <= lr && fc <= lc){
            for(int i = fc; i<= lc; i++){
                if(temp!= null) {
                    ans[fr][i] = temp.val;
                    temp = temp.next;
                }

                c++;
            }
            fr++;
            if(fr > lr || fc>lc) break;
            for(int i = fr; i<= lr; i++){
                if(temp!= null) {
                    ans[i][lc] = temp.val;
                    temp = temp.next;
                }
                c++;
            }
            lc--;
            if(fr > lr || fc>lc) break;
            for(int i = lc; i>= fc; i--){
                if(temp!= null) {
                    ans[lr][i] = temp.val;
                    temp = temp.next;
                    }
                c++;
            }
            lr--;
            if(fr > lr || fc>lc) break;
            for(int i = lr; i>= fr; i--){
                if(temp!= null) {
                    ans[i][fc] = temp.val;
                    temp = temp.next;
                }
                c++;
            }
            fc++;
        }

        return ans;
        
    }
}