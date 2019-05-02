class Marksheet{
	int math;
	int c;
	int oop;

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

class Sheet{
	public static void main(String[] sw31) {
		Marksheet obj = new Marksheet();
		obj.math = 99;
		obj.c = 88;
		obj.oop = 85;
		System.out.println("Total Marks: "+obj.marks());
		System.out.println("Total Percentage: "+obj.percentage());
		System.out.print("Grade: "+obj.grade());
	}
}