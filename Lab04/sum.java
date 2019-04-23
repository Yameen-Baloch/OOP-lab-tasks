import java.util.*;

class sum{
	public static void main(String sw31[]){
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		int num = s.nextInt();

		int sum = 0;

		for(int i = 1; i <= num; i++){
			sum += i;
		}

		System.out.print("Sum = "+ sum);
	}
}