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
        StringBuilder st = new StringBuilder();
        while (head != null) {
            st.append(head.val);
            head = head.next;
        }

        String p = st.toString();
        String rev = st.reverse().toString();
        if (p.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }
}
