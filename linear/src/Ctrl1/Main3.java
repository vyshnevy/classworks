package Ctrl1;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        if (x<2) {double y=x;
            System.out.println("y = "+y);
        }else{
            System.out.println("y = 2");

        }
    }
}
