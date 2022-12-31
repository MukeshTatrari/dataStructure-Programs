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
    public ListNode sortList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode node = head;
        List<Integer> ls = new ArrayList<Integer>();
        while(node!=null){
            ls.add(node.val);
            node = node.next;
        }
        Collections.sort(ls);
        ListNode newHead = new ListNode(ls.get(0));
        ListNode temp = newHead;
        for(int i=1;i<ls.size();i++){
            ListNode n = new ListNode(ls.get(i));
            temp.next = n;
            temp = n;
        }
        return newHead;
    }
}