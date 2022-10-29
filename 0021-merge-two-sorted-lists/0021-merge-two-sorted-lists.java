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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;
        
        
        List<Integer> ls = new ArrayList<Integer>();
        while (list1 != null) {
            Integer p = list1.val;
            ls.add(p);
            list1 = list1.next;
        }
        while (list2 != null) {
            Integer p = list2.val;
            ls.add(p);
            list2 = list2.next;
        }

        Collections.sort(ls);
        ListNode output = new ListNode(ls.get(0));
        ListNode head = output;
        for (int i = 1; i < ls.size(); i++) {
            ListNode list = new ListNode(ls.get(i));
            output.next = list;
            output = output.next;
        }

        return head;
    }
}
