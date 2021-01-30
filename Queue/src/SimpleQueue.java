
public class SimpleQueue {
	
	int size = 10;
	int items[] =new int[size];
	int front, rear;
	

	public SimpleQueue() {
		front = -1;
		rear = -1;
	}
	
	public boolean isFull() {
		if(front ==0 && rear == size-1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(front==-1) {
			return true;
		}
		return false;
	}
	
	public void enqueue(int element) {
		if(isFull()) {
			System.out.println("Queue is full;");
		}else {
			if(front == -1) //if condition not true it's jumping second line 
				front=0;
			    rear++;
			    items[rear] = element;
			    System.out.println(element +" is inserted");
		}
	}
	public int dequeue() {
		int element;
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}else {
			element =items[front];//the first element in the queue will move out
		
			if(front>=rear) {
				front = -1;
				rear = -1;
			}else {
				front++;
			}
			System.out.println("Deleted -> " + element);
		      return (element);
		      } }
	
	
	public void display() {
		 
		if (isEmpty()) {
		      System.out.println("Empty Queue");
		    } else {
		    	
		    	for(int var:items)
		    		   System.out.print(var + "  ");
		    	}
		  System.out.println();
		    }
	
	
	public static void main(String[] args) {
	SimpleQueue queue =new SimpleQueue();
	
	queue.enqueue(78);
	queue.enqueue(34);
	queue.enqueue(109);
	queue.enqueue(-98);

	queue.display();
	
	queue.dequeue();
	queue.dequeue();
	queue.dequeue();
	queue.dequeue();
	queue.dequeue();
	
	queue.display();

	}

}
