class largestNum{
	public static void main(String sw31[]){
		int arr[] = {1, 2, 3, 4, 5, 6};
		int large = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(large < arr[i]);
			large = arr[i];
		}
		System.out.print("Large Number in Array is: "+large);
	}
}