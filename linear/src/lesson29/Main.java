package lesson29;

public class Main {
    public static void main(String[] args) {
int[] mass = {3,4,324,3,24,32,4,32,432,4,32,4,3};
        for(int i = 0 , n =mass.length; i<n;i++) {
            mass[i] =(int)(Math.random()*10);
        }
    for (int temp: mass){
        System.out.println(" "+temp);
    }
    int count=0 , sum = 0;
        for(int i = 0 , n =mass.length; i<n;i++) {
            if(i%2==0){count++;}
            sum+=mass[i];
        }
        System.out.println("Sum is:"+sum+"\nCount  is:"+count);

    }

}


























































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































