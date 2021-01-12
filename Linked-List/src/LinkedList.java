
public class LinkedList {
	
	Node head;
	
	public static class Node{
		int value;
		Node next;
		
		public Node(int d ) {
			value =d;
			next =null;				
	}	}
	
	public void insertAtBeginning(int data) {
		
		Node newNode =new Node(data); 
		newNode.next = head;
		head = newNode;				
	}
	
	public void insertAtEnd(int data) {
		Node newNode =new Node(data);
		
		 if (head == null) {
		      head = new Node(data);
		      return;
		    }
		 newNode.next =null;
		 Node last =head; //we need a start point
		 
		 while(last.next!=null) {	 
			 last =last.next;		 
		 }
		 
		 last.next = newNode;
		 return;	 
	}
	
	public void insertAfter(Node prevNode, int data) {
		
		  if (prevNode == null) {
		      System.out.println("The given previous node cannot be null");
		      return;
		    }
		 
		  Node newNode =new Node(data);	  
		  newNode.next = prevNode.next;
		  prevNode.next= newNode;
	}
	
	public void deleteNode(int  position) {
		
		if(head ==null) {
			return;
		}
		Node node = head;
	
		 if (position == 0) {
		      head = node.next;
		      return;
		    }
		 
		 for(int i=0; node!=null && i<position ;i++  ) {
			 
			 node =node.next; //stepping to find the node

		 }
		 if (node == null || node.next == null)
		      return; // return, if the node is already deleted 

		 
		//else point out the previous node of the node that will have deleted   
		// to the  next node of deleted one 
		   
		    Node next = node.next.next; 
		    node.next = next;  
	}
	
	public  void  searchNode(int wanted) {
		Node node=head;
		
		while(node!=null) {
			
			if(node.value==wanted) {
				System.out.println(Integer.toString(wanted)+ "is found in linked list" ) ;
				return;
			}
			node =node.next;
			
		}
		System.out.println("The value that you wanted is not found");
		
	}
	public void printList() {
		Node node =head;
		
		while(node.next !=null) {
			System.out.println(node.value + " ");
			
			node = node.next;
		}
	}
	 public static void main(String[] args) {
		 
		 LinkedList linkedList = new LinkedList();
		 
		 linkedList.insertAtBeginning(5);
		 linkedList.insertAtBeginning(-45);
		 linkedList.insertAtEnd(4);
		 linkedList.insertAfter(linkedList.head.next, 78);
		 linkedList.insertAtEnd(56);
		 linkedList.deleteNode(2); 
		 linkedList.printList();
		 linkedList.searchNode(5);
		 
	 }
	 }
	

