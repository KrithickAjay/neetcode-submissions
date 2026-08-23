class MyCircularQueue {

    class Node{
        Node next;
        int val;
        Node(int val){
            this.val = val;
        }
    }

    Node front;
    Node rear;
    int size = 0;
    int capacity;
    public MyCircularQueue(int k) {
        capacity = k;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }

        Node newNode = new Node(value);
        if(isEmpty()){
            front = rear = newNode;
            rear.next = front;        
        }else{
            rear.next = newNode;
            newNode.next = front;
            rear = newNode;
        }

        size++;
        return true;

    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;

        front = front.next;
        rear.next = front;

        size--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return front.val;
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return rear.val;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */