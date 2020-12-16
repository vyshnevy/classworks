package pr18;

import java.util.Calendar;
import java.util.GregorianCalendar;

 class Main {
    public static void main(String[] args) {
        GregorianCalendar g = new GregorianCalendar();
        g.set(Calendar.MONTH, Calendar.FEBRUARY);
        g.set(Calendar.DAY_OF_MONTH, 27);
        int year = 2010;
        int y =year-5 ;
        for(int i =0;i<+10;i++){
            g.set(Calendar.YEAR, y+i);

            int d = g.get(Calendar.DAY_OF_WEEK);
            switch(d){
                case 1:
                    System.out.println("Sunday year is: "+year);break;
                case 2:
                    System.out.println("Mondayyear is: "+year);break;
                case 3:
                    System.out.println("Tuesdayyear is: "+year);break;
                case 4:
                    System.out.println("Wednesdayyear is: "+year);break;
                case 5:
                    System.out.println("Thursdayyear is: "+year);break;
                case 6:
                    System.out.println("Fridayyear is: "+year);break;
                case 7:
                    System.out.println("Saturday");break;
            }
        }
    }
}
