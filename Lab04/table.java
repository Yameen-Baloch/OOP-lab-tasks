import java.util.*;

class table{
	public static void main(String sw31[]){
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number for table: ");
		int num = s.nextInt();

		System.out.print("Enter The Starting number of table");
		int first = s.nextInt();

		System.out.print("Enter Ending Number of the table");
		int end = s.nextInt();

		for(int i = first; i <= end; i++){
			System.out.println(num+"x"+i+" = "+num*i);
		}
	}
}