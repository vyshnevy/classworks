package Ctrl1;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x= s.nextInt();
        int y =x/10;
        int z = x - 10*y;
        int sum = y+z;
        if(sum%3==0){
            System.out.println("YEs");
        }else {
            System.out.println("nO");
        }

    }
}
