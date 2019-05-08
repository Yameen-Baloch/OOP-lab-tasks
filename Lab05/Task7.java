class StringSplit{
	public static void main(String[] sw31) {
		String s = "Ali, 18, BE-Software; Aisha, 19, BE-Electronics";

		String[] sentence = s.split("[,;]");
		System.out.println("Student 1");
		System.out.println("Name:"+sentence[0]);
		System.out.println("Age:"+sentence[1]);
		System.out.println("Program:"+sentence[2]);
		System.out.println();
		System.out.println("Student 2");
		System.out.println("Name:"+sentence[3]);
		System.out.println("Age:"+sentence[4]);
		System.out.println("Program:"+sentence[5]);

	}
}