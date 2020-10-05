package lesson20;

        import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long pass = 0;
        do{
            System.out.println("Vvedite parol':");
            pass = s.nextLong();
        }while(pass != 244466666);
    }
}
