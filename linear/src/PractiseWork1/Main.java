package PractiseWork1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int n0 = 1;
        int n1 = 1;
        if (i == 1) {
            System.out.print(n0);
        } else if (i == 2) {
            System.out.print(n1);
        } else {
            System.out.print(n0 + " " + n1 + " ");
            for (i = 3; i <= 11; i++) {
                int n2 = n0 + n1;
                System.out.print(n2 + " ");
                n0 = n1;
                n1 = n2;
            }
        }
    }
}


