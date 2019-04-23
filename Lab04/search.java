import java.util.*;

class search{
	public static void main(String sw31[]){
		Scanner s = new Scanner(System.in);

		int[] arr = {1, 2, 3, 4, 5};

		System.out.print("Enter a Number which you want to search: ");
		int num = s.nextInt();

		int index = 0;
		boolean found = false;

		for(int i = 0; i < arr.length; i++){
			if(num == arr[i]){
			index = i;
			found = true;
		
			break;
		}
		}

			if(found){
				System.out.print("Number found at index: "+index);
			}
			else{
				System.out.print("Number is not found ");
			}

	}
}