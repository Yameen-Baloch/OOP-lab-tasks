import java.util.*;

class sorting{

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);  //for taking an input
		System.out.println("Enter A Random Array");

		int size = 10;	//size of an array

		int[] arr = new int[size];	//declarring an array

		 //for using while loop
		//Taking an array input
		for(int i = 0; i < arr.length; i++){
			arr[i] = s.nextInt();
		}
		//for loop for sorting an element
		for(int i = 0; i < arr.length; i++){
			int ptr = 0;
			while(ptr < arr.length-1){
				//arr = 2, 3, 1
				if(arr[ptr] > arr[ptr+1]){
					//swapping
					int temp = arr[ptr];
					arr[ptr] = arr[ptr+1];
					arr[ptr+1] = temp;
				}
				ptr ++;
			}
			
		}
		System.out.print("After Sorting: ");
		for(int k = 0; k < arr.length; k++){
			System.out.print(arr[k]+" ");
		}
	} 
}