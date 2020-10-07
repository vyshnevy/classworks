package PractiseWork1;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        System.out.println("Введите до какого числа выводить простые числа: ");
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
int i = 2;
int j = 2;
            while( i<c)
            {int k=0;

                while(j<=i)
                {
                    if ((i%j) == 0)
                        k++;
                j++;}
                if (k<2)
                    System.out.print(i + " ");
i++;
          }
      }
  }



