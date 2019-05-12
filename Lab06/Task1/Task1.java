class Author{
	private String name;
	private String email;
	private char gender;

	Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName(){
		return name;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public char getGender(){
		return gender;
	}

	public String toString(){
		return "Author[name= "+name+", Email= "+email+", Gender= "+gender+"]";
	}

}

class AuthorData{
	public static void main(String sw31[]){
		Author a = new Author("Yameen", "yameen12345@gamil.com", 'm');
			System.out.println(a.getName());
			System.out.println(a.getEmail());
			System.out.println(a.getGender());
			System.out.println();
			System.out.println(a.toString());
	}
}