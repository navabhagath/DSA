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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(ListNode curr : lists){
            while(curr!=null){
                pq.offer(curr.val);
                curr = curr.next;
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while(!pq.isEmpty()){
            int x = pq.poll();
            head.next = new ListNode(x);
            head = head.next;
        }
        return dummy.next;
    }
}