package lesson20;

public class Main {
    public static void main(String[] args) {
        int b = 1000;
        int g = 2000;
        int year = 2020;
        int rate = 11;
        while(b<g){
  double p = b*rate/100;
   b += p;
   year++;
        }
        System.out.println(b+"  "+year);
    }

}
