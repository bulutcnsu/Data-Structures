
public class StackwithLinkedList {
 private class Node{
	 Object data;
	 Node link;
 }
 Node top;
 
 public StackwithLinkedList(){
	 this.top=null;
 }
	public void push(Object element) {
		
		Node temp =new Node();
		temp.data = element;
		temp.link = top;
		top = temp;
		
	}
	
	public boolean isEmpty()
    {
        return top == null;
    }
	
	  public Object peek()
	    {
	        // check for empty stack
	        if (!isEmpty()) {
	            return top.data;
	        }
	        else {
	            System.out.println("Stack is empty");
	            return -1;	        
	            } }
	
	  
	  public void pop() {
		   if (top == null)
	        { 
	            System.out.println("\nStack Underflow"); 
	            return; 
	        } top =(top).link;
	        }
	  
	  public void display() {
		  if (top == null) {
	            System.out.printf("\nStack Underflow");
	           System.exit(1);
	        }else {
	        	
	        	Node temp =top;
	        	
	        	while(temp!=null) {        		
	        		System.out.println(temp.data);
	        		
	        		temp = temp.link;
	        	}
	        	
	        	
	        }
	  }
	public static void main(String[] args) {
		
		StackwithLinkedList stack = new StackwithLinkedList();
		stack.push(34);
		stack.push("Ýstanbul");
		stack.push("Ankara");
		stack.push(06);
		
		stack.display();
		System.out.println(stack.isEmpty());
		
		System.out.println("Top element is: "+ stack.peek());
		
		stack.pop();
		stack.pop();
		
		stack.display();
		
		System.out.println("Top element is: "+ stack.peek());
		

	}

}
