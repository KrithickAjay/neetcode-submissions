class MyQueue {
    Stack<Integer> input= new Stack<>();
    Stack<Integer> output= new Stack<>();
    public MyQueue() {   
    }
    public void push(int x) {
        input.push(x);
    }

    public void transfer(){
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
    }
    
    public int pop() {
        transfer();
        return output.pop();
    }
    
    public int peek() {
        transfer();
        return output.peek();
        
    }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */