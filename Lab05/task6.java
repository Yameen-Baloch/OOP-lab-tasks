class Mark_sheet{
	int math;
	int c;
	int oop;
	String name;

	int marks(){
		int Total_marks = math+c+oop;

		return Total_marks;
	}

	float percentage(){
		float Percentage = (float)((math+c+oop)*100)/300;

		return Percentage;
	}

	char grade(){
		float Percentage = (float)((math+c+oop)*100)/300;

		if(Percentage >= 90){
			return 'A';
		}
		else if(Percentage >= 80 && Percentage <= 89){
			return 'B';
		}
		else if(Percentage >= 70 && Percentage <= 79){
			return 'C';
		}
		else if(Percentage >= 60 && Percentage <= 69){
			return 'D';
		}
		else if(Percentage >= 50 && Percentage <= 59){
			return 'E';
		}
		else{
			return 'F';
		}
	}

}

class sheet{
	public static void main(String[] sw31) {
		Mark_sheet obj = new Mark_sheet();
		Mark_sheet obj1 = new Mark_sheet();
		obj.name = "Yameen";
		obj.math = 99;
		obj.c = 88;
		obj.oop = 85;

		obj1.name = "Moiz";
		obj1.math = 100;
		obj1.c = 90;
		obj1.oop = 88;
		System.out.println(obj.name);
		System.out.println("Total Marks: "+obj.marks());
		System.out.println("Total Percentage: "+obj.percentage());
		System.out.println("Grade: "+obj.grade());

		System.out.println();

		System.out.println(obj1.name);
		System.out.println("Total Marks: "+obj1.marks());
		System.out.println("Total Percentage: "+obj1.percentage());
		System.out.print("Grade: "+obj1.grade());
	}
}