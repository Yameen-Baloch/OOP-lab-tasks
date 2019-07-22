package mypake3;

class Name{
	final void getName(){
		System.out.println("Yameen");
	}
}

class CastName extends Name{
	void getName(){
		System.out.println("Baloch");
	}
}

class RollNo extends Name{
	void getName(){
		System.out.println("18sw31");
	}
}

class FinalClass{
	public static void main(String[] args) {
		RollNo r = new RollNo();
		r.getName();
		// It Gives an exception that class rollno has extends the final method;
	}
}