// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode mergeKLists(ListNode[] lists) {
        
//         if(lists == null || lists.length == 0) return null;
//         PriorityQueue<ListNode> pq = 
//         new PriorityQueue<>((a,b) -> a.val - b.val );

//         for(ListNode list : lists){
//             if(list != null){
//                 pq.offer(list);
//             }
//         }

//         ListNode dummy = new ListNode(0);
//         ListNode curr = dummy;
//         while(!pq.isEmpty()){

//             ListNode node = pq.poll();

//             curr.next = node;
//             curr = curr.next;

//             if(node.next != null){
//                 pq.offer(node.next);
//             }


//         }

//         return dummy.next;
//     }
// }

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

     // public ListNode mergeKLists(ListNode[] lists) {

    //     ListNode result = null;
    //     for(int i=0;i<lists.length;i++){
    //         result = mergeTwoLists(lists[i] , result);
    //     }

    //     return result;
    // }
    
    public ListNode mergeKLists(ListNode[] lists) {

        if(lists == null || lists.length == 0){
            return null;
        }

        return solve(lists,0,lists.length-1);
    }

    public ListNode solve(ListNode[] lists , int left, int right){

        if(left == right){
            return lists[left];
        }

        int mid = left+ (right - left)/ 2;

        ListNode leftList = solve(lists,left,mid);
        ListNode rightList = solve(lists,mid+1,right);

        return mergeTwoLists(leftList, rightList);
    }

    public ListNode mergeTwoLists(ListNode list1,ListNode list2){

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                curr.next = list1;
                list1 = list1.next;
            }else{
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;
        }

        if(list1 != null){
            curr.next = list1;
        }else{
            curr.next = list2;
        }

        return dummy.next;
    }
}
