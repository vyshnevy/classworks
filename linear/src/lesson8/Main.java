package lesson8;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("input a");
        int a = s.nextInt();
        System.out.println("input b");
        int b = s.nextInt();
        System.out.println("input c");
        int c = s.nextInt();
        double d = b*b - 4*a*c;
        System.out.println(d);
        if (d<0){
            System.out.println("no");
        }
        if (d==0)
        {
            double x = (-b+ Math.sqrt(d))/(2*a);
            System.out.println(x);

        }

        if (d>0){
            double x1 = (-b+ Math.sqrt(d))/(2*a);
            double x2 = (-b- Math.sqrt(d))/(2*a);
            System.out.println("x1 is " +x1+"x2 is "+x2);


        }




    }


}


