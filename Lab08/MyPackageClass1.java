package mypake;

interface AdvancedArithmetic{
	int sumOfFactors(int n);
	
}

class MyCalculator implements AdvancedArithmetic{

	public int sumOfFactors(int x){
		int sum = 0;
		for(int i = 1; i <= x; i++){
			if(x%i == 0){
				sum += i;
			}
		}
		return sum;
	}
}

class MainClass{
	public static void main(String[] args) {
		MyCalculator m = new MyCalculator();
		System.out.println(m.sumOfFactors(6));
	}
}