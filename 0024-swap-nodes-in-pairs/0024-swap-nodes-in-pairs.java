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

        if (head == null || head.next == null) {
            return head;
        }
        ListNode left = head;
        ListNode res = null;
        ListNode prevLeft = null;
        ListNode right;
        int size = 2;

        while (true) {
            right = left;

            for (int i = 0; i < size - 1; i++) {

                if (right == null)
                    break;

                right = right.next;
            }

            if (right == null) {
                break;
            }
            ListNode nextLeft = right.next;

            right = reverse(left, size);

            if (prevLeft != null) {
                prevLeft.next = right;
            }
            if (res == null) {
                res = right;
            }
            prevLeft = left;

            left = nextLeft;
        }

        if (prevLeft != null && left != null) {
            prevLeft.next = left;
        }
        return res;
    }

    private ListNode reverse(ListNode left, int size) {

        ListNode curr = left;
        ListNode prev = null;
        int i = 0;
        while (i < size) {
            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;

            i++;
        }
        return prev;
    }
}