package task26;

public class task26 {
   private int[] deque;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    public task26(int k) {
        this.capacity = k;
        this.deque = new int[k];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        front = (front - 1 + capacity) % capacity;
        deque[front] = value;
        size++;
        return true;
    }
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        deque[rear] = value;
        rear = (rear + 1) % capacity;
        size++;
        return true;
    }
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;
        size--;
        return true;
    }
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        rear = (rear - 1 + capacity) % capacity;
        size--;
        return true;
    }
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return deque[front];
    }
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return deque[(rear - 1 + capacity) % capacity];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
    public static void main(String[] args) {
        task26 deque = new task26(3);
        System.out.println(deque.insertLast(1));  
        System.out.println(deque.insertLast(2));  
        System.out.println(deque.insertFront(3)); 
        System.out.println(deque.insertFront(4)); 
        System.out.println(deque.getRear());      
        System.out.println(deque.isFull());       
        System.out.println(deque.deleteLast());   
        System.out.println(deque.insertFront(4)); 
        System.out.println(deque.getFront());     
    }
}