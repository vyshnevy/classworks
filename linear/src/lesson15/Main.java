package lesson15;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       /* char answer = s.next().charAt(0);
        switch (answer){
            case 'Y':
                System.out.println("Yes");
                break;
            case 'y':
                System.out.println("yes");
                break;
            case 'N':
                System.out.println("No");
                break;
            default:
                System.out.println("Salo");

}*/
     /*  boolean a = true;
       boolean j = true;
        System.out.println(!a);
        System.out.println(!j);
        System.out.println(a&j);
        System.out.println(a|j);
        System.out.println(a&&j);
        System.out.println();*/
 int x = 0;
 boolean b1,b2,b3,b4;
 b1=b2=b3=b4=true;
 x=(b1|b2&b3^b4)?x++:-x;
        System.out.println(x)  ;


        }





}
