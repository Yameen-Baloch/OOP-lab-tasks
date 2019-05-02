import java.util.*;

class Dog{
	String name;
	String breed;
	int age;

	void SetDetails(String n, String b, int a){
		name = n;
		breed = b; 
		age = a;
		
	}
	void showDetails(){
		if(name != null && breed != null && age >= 0){
			
			System.out.println("Details are: ");
			System.out.println("name is: "+name);
			System.out.println("breed is: "+breed);
			System.out.println("age is: "+age);
		}
		else{
			System.out.print("details are unavailable. ");
		}
		
	}
}

class GetDog{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.SetDetails("puppy", "wolf", 13);
		d.showDetails();
	}
}