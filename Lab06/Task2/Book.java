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

class Book{
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;


	public Book(String name, Author[] authors, double price){
		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	public Book(String name, Author[] authors, double price, int qty){
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public String getName(){
		return name;
	}

	public Author[] getAuthors(){
		return authors;
		
	}

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return price;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public int getQty(){
		return qty;
	}
	public String toString(){
		String data="";
		for(int i=0;i<authors.length;i++)
		data+="authors= {Author[name= "+authors[i].getName()+", email= "+authors[i].getEmail()+", gender="+authors[i].getGender()+"],....},";
		return  data+"Book[name= "+name+",  price="+price+", qty= "+qty+"]";
	}
}

class BookData{
	public static void main(String sw31[]){
		Author author1 = new Author("Yasir", "yasirbhatti123@gmail.com", 'm');
		Author author2 = new Author("MYasir", "myasirbhatti123@gmail.com", 'm');
		Author author3 = new Author("M1Yasir", "m1yasirbhatti123@gmail.com", 'm');



		Author array[] = {author1,  author2, author3};

		Book book = new Book("C++", array, 155.12, 2);
		book.getAuthors();

		System.out.println(book.toString());

	}
}