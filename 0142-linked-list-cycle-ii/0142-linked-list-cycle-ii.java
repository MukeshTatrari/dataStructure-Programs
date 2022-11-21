/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> hm = new HashMap<ListNode, Integer>();
        while (head != null) {
            if (hm.containsKey(head)) {
                return head;
            } else {
                hm.put(head, 1);
                head = head.next;
            }
        }
        return null;
    }
}
