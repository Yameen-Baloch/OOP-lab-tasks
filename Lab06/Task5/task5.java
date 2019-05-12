class Student
{
	private String name;
	private int age;
	private String address;

	Student(){
		name = "unknown";
		age = 0;
		address = "not available";
	}

	public void setInfo(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void setInfo(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void getInfo(){
		System.out.println(name+" "+age+" "+address);
	}
}

class Info
{
	public static void main(String[] args) {
		Student obj = new Student();
		Student obj1 = new Student();
		Student obj2 = new Student();
		Student obj3 = new Student();
		Student obj4= new Student();
		Student obj5 = new Student();
		Student obj6 = new Student();
		Student obj7 = new Student();
		Student obj8 = new Student();
		Student obj9 = new Student();
		Student[] array = {obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9};
		
		obj.setInfo("Yameen",  19, "   ;dadu");
		obj1.setInfo("Yasir",  19, "   ;Badin");
		obj2.setInfo("Moiz",   19, "   ;Gudu");
		obj3.setInfo("Sarwan", 19,"    ;Noshehro");
		obj4.setInfo("Adeel",  18, "   ;Nawabshah");
		obj5.setInfo("Saqib",  19, "   ;Nawabshah");
		obj6.setInfo("Saad",   19, "   ;Hyderabad");
		obj7.setInfo("Talha",  19, "   ;Badin");
		obj8.setInfo("Altamash", 19, " ;Badin");
		obj9.setInfo("Babar",  19, "   ;dadu");
		for(int i = 0; i < array.length; i++){
			array[i].getInfo();
		}
	
	}
}