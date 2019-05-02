// Using Scanner class to get input.

import java.util.*;

class GetInput{
	public static void main(String[] sw31) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Your name: ");

		String name = s.nextLine();

		System.out.print("Your name is: "+name);
	}
}