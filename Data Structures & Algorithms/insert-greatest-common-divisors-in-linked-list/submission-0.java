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
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode curr = head;
       

        while(curr != null && curr.next != null){
            
            ListNode second = curr.next;

            ListNode gcdNode = new ListNode(findgcd(curr,second));

            curr.next = gcdNode;
            gcdNode.next = second;

            curr = second;

        }


        return head;
    }

    public int findgcd(ListNode first ,ListNode second){
        int a = Math.max(first.val,second.val);
        int b = Math.min(first.val,second.val);

        while(b>0){
            int temp = b;
            b = a%b;
            a = temp;
        }

        return a;
    }
}