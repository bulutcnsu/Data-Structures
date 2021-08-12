
public class BubbleSort {
	
	 static void sortElements(int arr[]) {
		
		for(int i=0;i<arr.length-1 ;i++) 
			 for (int j = 0; j < arr.length - i - 1; j++) 
				 
				 if(arr[j]>arr[j+1]) {
					 
					 //swapping
					 int temp= arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp; 
			
		}
		
	}
	static void printArray(int arr[]) {
		for(int i=0; i<arr.length-1;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	
	
	public static void main(String [] args){
	
		int arr [] = {16,23,-95,11,74,-63,0,44,22,71,63,-888};
		
		sortElements(arr);
		printArray(arr);
		
	}
}
