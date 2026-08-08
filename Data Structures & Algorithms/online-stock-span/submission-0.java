class StockSpanner {
    Stack<int[]> stack;
    public StockSpanner() {
        stack=new Stack<>();
    }
    
    public int next(int price) {
        int span=1;

        while(!stack.isEmpty() && stack.peek()[0] <= price){
            span+= stack.pop()[1];
        }

        stack.push(new int[]{price,span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
//  class StockSpanner {
//     Stack<Integer> stack;
//     public StockSpanner() {
//         stack=new Stack<>();
//     }
    
//     public int next(int price) {
//         stack.push(price);
//         int count=1;
//         int check=stack.peek();
//         for(int i=stack.size()-2;i>=0;i--){
//             if(check >= stack.get(i)){
//                 count++;
//             }else{
//                 break;
//             }
//         }
//         return count;
//     }
// }

// /**
//  * Your StockSpanner object will be instantiated and called as such:
//  * StockSpanner obj = new StockSpanner();
//  * int param_1 = obj.next(price);
//  */