import java.util.*;
class arithmetic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        System.out.println("Enter a arithmetic Operater");
        char ch = sc.next().charAt(0);
        switch(ch){
            case '+':{
                System.out.println("Sum of these numbers = "+(a+b));
                break;
            }
            case '-':{
                System.out.println("Subtraction of these numbers = "+(a-b));
                break;
            }
            case '*':{
                System.out.println("Product of these numbers = "+(a*b));
                break;
            }
            case '/':{
                System.out.println("Division of these numbers = "+(a/b));
                break;
            }
            default:{
                System.out.println("Please choose correct operand");
                break;
            }
        }
    }
}