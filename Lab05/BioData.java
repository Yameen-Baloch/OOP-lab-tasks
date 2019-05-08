class Student{
	String name;
	int rollNo;
	String department;
	int age;

}


class Marksheet{
	int oop;
	int dcld;
	int laag;
	int totalMarks;
	float percentage;
	char grade;
}

class Result{

	Result(Student s1, Marksheet m1){
		
	s1.name = "Yameen Baloch";
	s1.rollNo = 31;
	s1.department = "Software Engineer";
	s1.age = 19;

	m1.oop = 87;
	m1.dcld = 93;
	m1.laag = 95;

	m1.totalMarks = m1.oop+m1.dcld+m1.laag;

	m1.percentage = (float) (m1.totalMarks*100)/300;

	if(m1.percentage >= 85){
		m1.grade =  'A';
	}
	else if(m1.percentage >= 75 && m1.percentage <= 84){
		m1.grade =  'B';
	}
	else if(m1.percentage >= 70 && m1.percentage <= 74){
		m1.grade = 'C';
	}
	else if(m1.percentage >= 60 && m1.percentage <= 69){
		m1.grade =  'D';
	}
	else if(m1.percentage >= 50 && m1.percentage <= 59){
		m1.grade =  'E';
	}
	else{
		m1.grade =  'F';
	}

	}
	void createStudentResult(Student s1, Marksheet m1){

		System.out.println("Name: "+s1.name);
		System.out.println("Age: "+s1.age);
		System.out.println("Roll Number: "+s1.rollNo);
		System.out.println("Name Of Department: "+s1.department);
		System.out.println();
		System.out.println("Marks in oop: "+m1.oop+"out of 100");
		System.out.println("Marks in dcld: "+m1.dcld+"out of 100");
		System.out.println("Marks in laag: "+m1.laag+"out of 100");
		System.out.println("Total Marks obtained: "+m1.totalMarks);
		System.out.println("percentage : "+m1.percentage);
		System.out.println("Grade: "+m1.grade);
}
}

class mainClass{
	public static void main(String[] sw31) {
		Student s1 = new Student();

		Marksheet m1 = new Marksheet();

		Result r = new Result(s1,m1);
		r.createStudentResult(s1, m1);
	}
}