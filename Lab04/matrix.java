class matrix{
	public static void main(String sw31[]){

		int A[][] = {{1, 2}, {4, 1}, {1, 5}};
		int B[][] = {{2, 6}, {7, 4}, {9,  3}};
		int[][] sum = new int[3][3];

		for(int i = 0; i < A.length; i++){
			for(int j = 0; j < A[i].length; j++){
			 sum[i][j] = A[i][j] + B[i][j];

				System.out.print(sum[i][j]+" ");		
			}
			System.out.println();
		}
	}
}