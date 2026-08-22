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
    public void reorderList(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;

        ListNode curr = second;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        second = prev;

        ListNode first = head;

        while(first != null && second != null){
            ListNode fnext = first.next;
            ListNode snext = second.next;

            first.next = second;
            second.next = fnext;

            first = fnext;
            second = snext;           
        }


    }
}
