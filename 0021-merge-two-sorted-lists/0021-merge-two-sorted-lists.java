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
import java.util.*;

class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        List<Integer> ls = new ArrayList<Integer>();
        while (list1 != null) {
            ls.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            ls.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(ls);
        ListNode ls1 = new ListNode(ls.get(0));
        ListNode head = ls1;
        for (int i = 1; i < ls.size(); i++) {
            ListNode l = new ListNode(ls.get(i));
            ls1.next = l;
            ls1 = ls1.next;
        }
        return head;
    }
}
