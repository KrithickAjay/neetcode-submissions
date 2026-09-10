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

            ListNode gcdNode = new ListNode(findgcd(curr.val,second.val));

            curr.next = gcdNode;
            gcdNode.next = second;

            curr = second;

        }


        return head;
    }

    public int findgcd(int a , int b){
        while(b>0){
            int temp = b;
            b = a%b;
            a = temp;
        }

        return a;
    }
}