package PW7;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Vvedite pervoe chislo");
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        System.out.println("Vvedite vtoroe chislo");
        Scanner c = new Scanner(System.in);
        int f = c.nextInt();
        int i = 0;
        int x = 0;

        while (i<1000){ if(i%3==0||i%11==0){  x++;
        }
        i++;
        }
        System.out.println(x);

    }
}
