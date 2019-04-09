class Number{
	public static void main(String[] args) {
		
		double n = 50.25;
		int integer = (int)n;
		float d = (float)(n-integer);
		System.out.println("Actual Number = "+n);
		System.out.println("Integral Part = "+integer);
		System.out.println("Floating Part = "+d);
	}
}