class Area
{
	public double printArea(double length,  double width)
	{
		return length*width;
	}

	public double printArea(double side)
	{
		return side*side;
	}
}


class MainClass
{
	public static void main(String[] args) {
		Area obj = new Area();

		System.out.println(obj.printArea(1.4, 89.1));

		System.out.println(obj.printArea(5.0));
		
	}
}