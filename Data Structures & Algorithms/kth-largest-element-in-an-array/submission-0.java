class Solution {
    public int findKthLargest(int[] arr, int k) {
       PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
       for(int i=0;i<arr.length;i++){
        pq.add(arr[i]);
       }
       for(int i=1;i<k;i++){
        pq.poll();
       }
       return pq.peek();
    }
}
