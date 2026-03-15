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
class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {

        ListNode ls1 = head1;
        ListNode ls2 = head2;

        while(ls1 != ls2){

            if(ls1 == null){
                ls1 = head2;
            } else {
                ls1 = ls1.next;
            }

            if(ls2 == null){
                ls2 = head1;
            } else {
                ls2 = ls2.next;
            }

        }

        return ls1;
    }
}
