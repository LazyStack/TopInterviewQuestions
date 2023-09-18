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

        ListNode curr = head, prev = null;
        while (curr != null && curr.next != null) {
            if (curr == head) head = curr.next;//for first time check
            else prev.next = curr.next;
            //The Swap
            ListNode tmp = curr.next.next;
            curr.next.next = curr;
            curr.next = tmp;

            //Ready for next swap iteration
            prev = curr;
            curr = tmp;
        }
        return head;

        

        

    }
}