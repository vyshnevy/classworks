package Pr16;

import java.util.Scanner;

public class Dispatcher {
    public static void main(String[] args) {
        int a1, a2, b1, b2;
        Dot a =new Dot();
        Dot b =new Dot();
        Scanner c = new Scanner(System.in);
        System.out.println("Ведите х А: ");
        a.x= c.nextInt();
        System.out.println("Ведите y А: ");
        a.y= c.nextInt();
        System.out.println("Ведите х B: ");
        b.x= c.nextInt();
        System.out.println("Ведите y B: ");
        b.y= c.nextInt();
        System.out.println(a.x+a.y+b.x+b.y);

    }
}