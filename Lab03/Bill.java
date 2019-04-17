import java.util.*;
class Bill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Units of consumed electricity");
        float units = sc.nextFloat();
        float display = 0;
        if(units <= 50){
            display  = 50*10;
            System.out.println(display);
        }
        else if(units >= 51 && units <=100){
            display  = 50*10+(units-50)*15;
            System.out.println(display);
        }
        else if(units >= 101 && units <= 200){
            display  = 50*10+50*15+(units-100)*20;
            System.out.println(display);
        }
        else if(units >= 201 && units <= 300){
            display  = 50*10+50*15+100*20+(units-200)*25;
            System.out.println(display);
        }
        else if(units >= 301){
            display  = 50*10+50*15+100*20+100*25+(units-300)*30;
            System.out.println(display);
        }
    }

}