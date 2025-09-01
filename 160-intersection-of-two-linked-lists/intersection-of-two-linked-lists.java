/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode>hs = new HashSet<>();
        ListNode temp1 = headA;
        while(temp1!=null){
            hs.add(temp1);
            temp1 = temp1.next;
        }
        ListNode dum = new ListNode(-1);
        ListNode ans = dum;
        ListNode temp2 = headB;
        while(temp2 != null){
            if(hs.contains(temp2)){
                dum.next = new ListNode(temp2.val);
                return ans.next;
            }
            temp2 = temp2.next;
        }
        return null;
    }
}