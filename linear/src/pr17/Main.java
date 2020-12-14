package pr17;

import java.util.Calendar;
import java.util.GregorianCalendar;

//ПР17: "Вывод украинизованного календаря текущего месяца с использованием API класса GregorianCalendar
//
//
//
//Вывести месяц своего дня рождения в 2017 (каждому свой).
//
//
//


public class Main{
    public static void main(String[]args){

        GregorianCalendar d =new GregorianCalendar();
        d.set(Calendar.MONTH, Calendar.FEBRUARY);
        d.set(Calendar.DAY_OF_MONTH, 27);
        d.set(Calendar.YEAR, 2017);
        int today=d.get(Calendar.DAY_OF_MONTH);
        int month=d.get(Calendar.MONTH);
        d.set(Calendar.DAY_OF_MONTH,1);

        int weekday=d.get(Calendar.DAY_OF_WEEK);

        System.out.println("Mon   Tue   Wed   Thu   Fri   Sat   Sun");

        for(int i=Calendar.MONDAY;i<weekday;i++){
            System.out.print("      ");//6spaces
        }



        do{

            int day=d.get(Calendar.DAY_OF_MONTH);

            System.out.printf("%3d",day);

            if(day==today){

                System.out.print("*  ");

            }else{

                System.out.print("   ");

            }

            if(weekday==Calendar.SUNDAY){

                System.out.println();

            }

            d.add(Calendar.DAY_OF_MONTH,1);

            weekday=d.get(Calendar.DAY_OF_WEEK);





        }while(d.get(Calendar.MONTH)==month);

    }

}
