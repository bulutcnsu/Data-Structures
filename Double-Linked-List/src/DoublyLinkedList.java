
public class DoublyLinkedList {

	
	class Node {
		int data;
		Node prev;
		Node next;
		
		
		public Node(int data) {
			this.data =data;
		}
	}
	Node head, tail = null;
	
	public void addNode(int data) {
		//Create a new node
		Node newNode =new Node(data);
		
		if(head == null) { // if list is empty
			head = tail =newNode;
			head.prev = null;
			tail.next = null;
			
		}
		else { //add new node to end of list
		Node temp=head;
		
		while(temp.next != null) { 
			temp = temp.next;
		}
		
		temp.next = tail =newNode;
		newNode.prev=temp;
		newNode.next =null;
		
		}	
	}
	public void deleteAfter(Node prevNode ) {
		
		if(prevNode == null) {
			 System.out.println("The given previous node cannot be NULL ");
		        return;	
		}
		else {
			Node temp =prevNode.next;
			
			prevNode.next = temp.next;
			temp.next.prev = prevNode;
			temp.prev = null;
			temp.next =null ;
		}	
	}
	public void insertAfter(Node prevNode,int data) {
		 
		   if (prevNode == null) {
		        System.out.println("The given previous node cannot be NULL ");
		        return;
		    }
		
		   Node new_node = new Node(data);
		   
		   new_node.next = prevNode.next;
		   prevNode.next = new_node;
		   new_node.prev = prevNode;
		
		    if (new_node.next != null)
		        new_node.next.prev = new_node;
	}
	public void deleteHead() {
	
		if(head == null) {
			  System.out.println("The head is already null ");
			return ;
		}
		else {
			
			if(head.next == null) {// if head is only one element in list
				head = null;
			}
			else {
				Node temp =head;
				head = temp.next; //next node of head is new head
				head.prev = null;		
			}
		}	
	}
	public void insertEnd(int newData) {
		
		Node new_node = new Node(newData);
		Node last = head;
		new_node.next =null; //this node gonna to be tail
		
		//if list is empty,then make new node as head
		 if (head == null) {
		        new_node.prev = null;
		        head = new_node;
		        return;
		    }
		 //else traverse till the last node
		 while (last.next != null) {
		        last = last.next;}
		 
		 last.next = tail = new_node ;
		 tail.prev = last;
		 	 
		
	}
    public void display() {  
	        //Node current will point to head  
	        Node current = head;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        System.out.print("Nodes of doubly linked list: ");  
	        while(current != null) {  
	            //Prints each node by incrementing the pointer.  
	  
	            System.out.print(current.data + " ");  
	            current = current.next;  
	        } 
	        System.out.println();}
    

   public static void main(String [] args) {
	   
	   DoublyLinkedList dll =new DoublyLinkedList();
	   
	   dll.addNode(77);
	   dll.addNode(-96);
	   dll.insertAfter(dll.head.next, 54);
	   dll.insertAfter(dll.head, 0);
	   dll.insertEnd(87);
	   dll.insertEnd(3);
	   
	   dll.display();
	   
	   dll.deleteHead();
	   dll.display();
	   
	   dll.deleteAfter(dll.head.next.next);
	   dll.display();
	   
	   
	   
   }}