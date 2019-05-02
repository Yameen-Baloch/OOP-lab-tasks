import java.util.*;

class getArray{

	int size = 10;
	int num[] = new int[size];
	
	void GetNum(){
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter An Array: ");
		for(int i = 0; i < size; i++){
			num[i] = x.nextInt(); 
			
		}
	}

	int even = 0; int odd = 0;

	void printEven(){
		for(int j = 0; j < size; j++){
			if(num[j]%2 == 0){
				even++;
				
			}
			else{
				odd++;
			
			}
		}
		System.out.println("Number of even numbers: "+even);
		System.out.print("Number of odd numbers: "+odd);
	}
}
class printArray{
	public static void main(String[] args) {
		getArray obj = new getArray();
		obj.GetNum();
		obj.printEven();

		
	}
}