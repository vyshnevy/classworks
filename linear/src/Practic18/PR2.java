package Practic18;


import java.util.Scanner;

public class PR2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ax,ay,bx,by,cx,cy,dx,dy;
        System.out.println("Введите координату х для точки А");
        ax = s.nextInt();
        System.out.println("Введите координату y для точки А");
        ay = s.nextInt();
        System.out.println("Введите координату х для точки B");
        bx = s.nextInt();
        System.out.println("Введите координату y для точки B");
        by = s.nextInt();
        System.out.println("Введите координату х для точки C");
        cx = s.nextInt();
        System.out.println("Введите координату y для точки C");
        cy = s.nextInt();
        System.out.println("Введите координату х для точки D");
        dx = s.nextInt();
        System.out.println("Введите координату y для точки D");
        dy = s.nextInt();

        if(ax==dx & ay==dy){
            System.out.println("Совпадение в точке");
        }
        if(bx==cx & by==cy){
            System.out.println("Совпадение в точке");
        }
        if (ax!=cx & ay!=cy & bx!=dx & by!=dy){
            System.out.println("Пересечение отсуствует");
        }
        if(ax==cx & by==cy){
            System.out.println("Совпадение верхний отрезок");
        }

        if(ay==dy & bx==dx){
            System.out.println("Совпадение нижний отрезок");
        }

        if(bx==cx & ay==cy){
            System.out.println("Совпадение правый отрезок");
        }

        if(ax==dx & by==dy){
            System.out.println("Совпадение левый отрезок");
        }
        if (ax==cx & ay==cy & bx==dx & by==dy){
            System.out.println("Полное совпадение");
        }
    }
}