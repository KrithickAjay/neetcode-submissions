class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        while(!pq.isEmpty() && pq.size() > 1){
            int x=pq.poll();
            int y=pq.poll();
            if(x == y){
                continue;
            }else if(x<y){
                pq.add(y-x);
            }else{
                pq.add(x-y);
            }
        }
        if(pq.isEmpty()){
            return 0;
        }
        return pq.poll();
    }
}
