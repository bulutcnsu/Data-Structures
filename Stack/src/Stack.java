import java.util.Arrays;
import java.util.Collections;

public class Stack {

	Object array[];
	int top =0;
	
	public Stack(int k) {
    array = new Object[k];
    		
	}
	
	public void push(Object element) {
     array[top] =element;
     top++;
		
	}
	
	public Object pop() {
		if(top>0) {
			top--;
			return array[top];
		}else
			return "Stack is empty";
	}
	
	public boolean empty(){
		if(top==0) {
			return true;
		}else
			return false;
	}
	
	public Object peek() {
		while(top>0) {
			return array[top];
		}
		return "Stack is empty";
	}
	
	public int search(Object element) {
		for(int i=top;i>0;i--) {
			if(array[i].equals(element)) 
				return i;	
		}
		return -1;
	}
	public void getList() {
	
		
		for (int i=top;i>0;i--) 
		{ 
		    System.out.println(array[i]);
    
		}	
	}
	
	public static void main(String[] args) {
		
		int size =11;
		Stack stack =new Stack(size);
		stack.push(15);
		stack.push("Istanbul");
		stack.push("Sydney");
		stack.push(45);
		stack.push('c');
		
		stack.getList();
		
		stack.pop();
		stack.pop();

		stack.getList();
		
		System.out.println(stack.peek());
		System.out.println(stack.empty());
		System.out.println(stack.search(18));

		

	}

}
