class Student{
	int rollno;
	String name;
	String department;

	Student(int rollno, String name, String department){
		this.rollno = rollno;

		this.name = name;

		this.department = department;
	}

	void showData(){
		System.out.println("Your name: "+name);
		System.out.println("Your roll no: "+rollno);
		System.out.println("Your department: "+department);
	}
}
	class MainClass{
		public static void main(String[] sw31) {
			Student obj = new Student(31, "Yameen", "Software");
			obj.showData();
		}
	}
