class MyCalculator{
    public static long power(int n, int p)throws Exception{
        
        if(n < 0 && p < 0){
            throw new Exception("n and p must not be Negative");
        }
        else if(n == 0 && p == 0){
            throw new Exception("n and p must Not be Zero");
        }
        else{
             long product = 0;
            for(int i = 1; i < p; i++){
                product = n*n;     
             }
             return product;
         }
        }
    public static void main(String args[]){
        try{
     System.out.println(MyCalculator.power(0, 4));
    }
    catch(Exception e){
        System.out.println("An Error Is Raised "+e);
    }
  }
}