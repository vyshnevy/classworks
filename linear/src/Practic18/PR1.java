package Practic18;

import java.util.Scanner;

public class PR1 {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца и нажмите Enter: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
       switch (n){
           case 1:
           case 2:
           case 12:
               System.out.println("Winter");
               break;
           case 3:
           case 4:
           case 5:
               System.out.println("Spring");
               break;
           case 6:
           case 7:
           case 8:
               System.out.println("Summer");
               break;
           case 9:
           case 10:
           case 11:
               System.out.println("Autumn");


       }


        }


    }

