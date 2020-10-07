package PW7;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("Введите до какого числа выводить простые числа: ");
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();

        for (int i=2;i<k;i++)
        {int c=0;

            for (int j=2;j<=i;j++)
            {
                if ((i%j) == 0)
                    c++;
            }
            if (c<2)
                System.out.print(i + " ");

        }
    }
    }

