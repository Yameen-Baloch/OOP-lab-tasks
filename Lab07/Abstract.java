abstract class Shape{
	private String color = "red"; 
	private boolean filled = true;

	public Shape(){
		System.out.println("Hi It's Constructor!");
	} 
	public Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setFilled(boolean filled){
		this.filled = filled;
	}

	public boolean isFilled(){
		return filled;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Circle extends Shape{
	private double radius = 1.0;
	Circle(){
		System.out.println("Hi to you!");
	}
	public Circle(double radius){
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled){
		this.radius = radius;
		getColor();
		isFilled();
	}
	public void setRadius(double radius){
		this.radius = radius;
	}

	public double getRadius(){
		return radius;
	}

	public double getArea(){
		return 3.141*radius*radius;
	}

	public double getPerimeter(){
		return 2*3.141*radius;
	}

	public String toString(){
		return "H It's toString!";
	}

}

class Ractangle extends Shape{
	private double width = 1.0;
	private double length = 1.0;

	public Ractangle(){
		System.out.println("This Is Constructor of Ractangle");
	}

	public Ractangle(double width, double length){
		this.length = length;
		this.width = width;
	}
	public Ractangle(double width, double length, String color, boolean filled){
		this.length = length;
		this.width = width;
		getColor();
		isFilled();
	}
	public void setWidth(double width){
		this.width = width;
	}
	public double getWidth(){
		return width;
	}
	public void setLength(double length){
		this.length = length;
	}
	public double getLength(){
		return length;
	}
	public double getArea(){
		return length*width;
	}
	public double getPerimeter(){
		return 2*(length+width);
	}

	public String toString(){
		return "Hi";
	}

}

class Square extends Ractangle{
	private double side;
	private double Length, Width;
	public Square(){
		System.out.println("This Is Constructor Of Square");
	}

	public Square(double side){
		this.side = side;
	}

	public Square(double side, String color, boolean filled){
		this.side = side;
		getColor();
		isFilled();
	}
	public void setSide(double side){
		this.side = side;
	}

	public double getSide(){
		return side;
	}

	public void setWidth(double width){
		 Width  =side*side;
	}
	public double getWidth(){
		return Width;
	}
	public void setLength(double side){
		 Length  =side*side;
	}
	public double getLength(){
		return Length;
	}

	public String toString(){
		return "Length of String is";
	}
}

class MainClass{
	public static void main(String[] args) {
		Ractangle s = new Ractangle(2.0, 2.5, "red", true);
		System.out.println(s.getArea());
		System.out.println(s.getLength());
	}
}