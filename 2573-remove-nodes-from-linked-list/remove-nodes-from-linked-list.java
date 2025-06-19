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
    public ListNode removeNodes(ListNode head) {
        List<Integer>al=new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            al.add(temp.val);
            temp = temp.next;
        }
        Stack<Integer>st=new Stack<>();
        int n = al.size();
        st.push(al.get(n-1));
        for(int i=n-2;i>=0;i--){
            if(al.get(i) >= st.peek()){
                st.push(al.get(i));
            }
        }
        System.out.println(st);
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(!st.isEmpty()){
            curr.next = new ListNode(st.pop());
            curr=curr.next;
        }
        System.out.println(st);
        return dummy.next;
        
    }
}