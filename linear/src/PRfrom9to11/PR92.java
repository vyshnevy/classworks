package PRfrom9to11;

import java.util.Scanner;

//Поиск элемента в массиве и определение количества повторов элемента
public class PR92 {
    public static void main(String[] args) {
        int[] r = new int[10];
        for (int i = 0, n = r.length; i < n; i++) {
            r[i] = (int) (Math.random() * 100 * Math.pow(-1, i));}
        for(int i = 0,l= r.length;i<l;i++){System.out.print(r[i]+", ");}
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter a number:");
        int j = 0;
        int c = s.nextInt();
        for(int i=0,l=r.length;i<l;i++){
            if(r[i]==c){j++;}
        }
        System.out.println(j);

    }
}
