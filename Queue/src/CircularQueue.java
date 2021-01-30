
public class CircularQueue {
	  int size = 5; // Size of Circular Queue
	  int front, rear;
	  int items[] = new int[size];

	  
	  public CircularQueue() {
		  front = -1;
		  rear = -1;
	  }
	  
	  public boolean isFull() {
		  if (front == 0 && rear == size - 1) {
		      return true;   }
		  if(front == rear+1) {
			  return true;
		  }
			  return false;
		  }
	  
	  public boolean isEmpty() {
		
		  if(front == -1) {
			  return true;
		  }else
			  return false;
	  }
	  
	  public void enqueue(int element) {
		  if(isFull()) {
			  System.out.println("Queue is full");
			  return;
		  }else {
			  if(front == -1) 
				  front = 0; //running if condition is true
				 rear = (rear +1)  % size; 
				 items[rear] = element;

			     System.out.println("Inserted " + element);
			  }  }	 
	  
	  public int  dequeue() {
		  int element;
		  if (isEmpty()) {
		      System.out.println("Queue is empty");
		      return -1;
		  }else {
			  element =items[front];
			  if(front == rear) {
				  front = -1;
				  rear = -1;
			  }
			  else {
				  front = (front + 1) % size;
			  }
			  return(element);
		  }  }
	
	  public void display() {
		   if (isEmpty()) {
			      System.out.println("Empty Queue");
			    }else {
			    	System.out.println("Front -> " + front);
			        System.out.println("Items -> ");
			         for (int i = front; i != rear; i = (i + 1) % size) {
			          System.out.print(items[i] + " ");
			         System.out.println(items[i]);}
			        System.out.println("Rear -> " + rear);
			      }
			}
 
	public static void main(String[] args) {
	    CircularQueue queue = new CircularQueue();

	    queue.enqueue(74);
	    queue.enqueue(22);
	    queue.enqueue(-96);
	    queue.enqueue(41);
	    queue.enqueue(-50);
	    
	    queue.display();
	    
	   queue.dequeue();
	   queue.dequeue();
	   queue.dequeue();
	   
	   queue.display();
	   
	   queue.enqueue(89);
	   queue.enqueue(41);
	  
	   queue.display();
	}

}
