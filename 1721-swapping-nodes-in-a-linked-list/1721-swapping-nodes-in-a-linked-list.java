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

    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        while (count < k - 1) {
            fast = fast.next;
            count++;
        }
        ListNode first = fast;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        int temp = slow.val;
        slow.val = first.val;
        first.val = temp;

        return head;
    }
}
