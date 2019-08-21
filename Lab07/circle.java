class Circle{
	private double radius = 1.0;
	private String color = "red";

	Circle(){
		System.out.println("This is Constructor of Circle");
	}

	Circle(double radius){
		this.radius = radius;
	}

	Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}

	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public double getArae(){
		return 3.141*radius*radius;
	}

	public String toString(){
		return "Circle[radius = "+radius+", color"+color+"]";
	}
}


class Cylinder extends Circle{
	private double height = 1.0;
	Cylinder(){
		System.out.println("THis Is Constructor of Cylinder");

	}
	Cylinder(double radius){
		
		super(12.23);
	}

	Cylinder(double radius, double height){
		
		super(15.34);
		this.height = height;
	}

	Cylinder(double radius, double height, String color){
		super(15.5); 
		this.height = height;
		getColor();
	}

	public void setHeight(double height){
		this.height = height;
	}

	public double getHeight(){
		return height;
	}

	public void getVolume(){
		System.out.println(getRadius()*height);
	}

}

class MainClass{
	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		c.setHeight(3.3);
		System.out.println(c.getHeight());
		c.getVolume();
	}
}