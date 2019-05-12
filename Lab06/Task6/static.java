class CountObjects{
	private static int count = 0;
	CountObjects(){
		count++;
	}
	public int getCount(){
		return count;
	}
}

class MainClass
{
	public static void main(String[] args) {
		CountObjects obj = new CountObjects();
		CountObjects obj1 = new CountObjects();
		CountObjects obj2 = new CountObjects();
		CountObjects obj3 = new CountObjects();
		CountObjects obj4 = new CountObjects();
		System.out.print(obj.getCount());

	}
}