package StackAndQueue;


public class QueueCreation {

	public static void main(String[] args) {
		Queue q= new Queue(5);
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println("peek::"+q.peek());
		q.dequeue();
		System.out.println("peek::"+q.peek());
		q.size();
	}

}


class Queue{
	int front , rear , count,capacity;
	int arr[];
	Queue(int size){
		front =0;
		rear = -1;
		count = 0;
		arr = new int[capacity];
		capacity = size;
		
	}
	public int dequeue() {
		int x=0;
		if(isEmpty()) {
			return -1;
		}
		x= arr[front];
		count--;
		front = (front+1)%capacity;
		return x;
	}
	public void enqueue(int i) {
		if(isFull())
			return;
		
		rear = (rear+1)%capacity;
		arr[rear] = i;
		count++;
	}
	public boolean isFull() {
		return count == capacity;
	}
	public boolean isEmpty() {
		return count ==0;
	}
	public int size () {
		return count;
	}
	public int peek() {
		return arr[front];
	}
}
