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
        int size = 2;
        if(head == null || head.next == null){
            return head;
        }
        ListNode left = head;
        ListNode res = left.next;
        ListNode prevLeft = null;
    
        while(left != null && left.next != null){
        
            ListNode right = left.next;
            ListNode next = right.next;
            // teeno mil gye left right next ab --
//swap
            right.next = left;
            left.next = next;

            if(prevLeft != null){
                prevLeft.next = right;
            }

            prevLeft = left;
            left = next;
        }
        return res;
    }
}