package PRfrom9to11;
//Із масиву видалити дублікати максимума та мінімума
public class PR111 {
    public static void main(String[] args) {//for (int i = 0, n = r.length; i < n; i++) {}
        int min = (int) Double.POSITIVE_INFINITY;
        int max = (int) Double.NEGATIVE_INFINITY;
        int maxI = 0;
        int minI = 0;
        int f1 = 0;
        int f2 = 0;
        int counter =-1;
        int[] r1 =new int[8];
        int[] r = new int[10];
        for (int i = 0, n = r.length; i < n; i++) {
            r[i] = (int) (Math.random() * 100 * Math.pow(-1, i));}
        for (int i = 0, n = r.length; i < n; i++) {
            System.out.print(r[i]+", ");
        }
        for (int i = 0, n = r.length; i < n; i++){
            if (min > r[i]) {
            min = r[i];
            minI = i;
        }
        if (max < r[i]) {
            max = r[i];
            maxI = i;}
        }
        for (int i = 0, n = r.length; i < n; i++) {
            if(r[i]==min& i!=minI){f1 = i;}
            if(r[i]==max& i!=maxI){f2 = i;}
        }
        for (int i = 0, n = r1.length; i < n; i++) {
        if(i==f2|i==f1){
        }else{counter++;
           r1[counter]=r[i];
        }


        }
        for (int i = 0, n = r1.length; i < n; i++) {
            System.out.println(r1[i]);
        }
    }

}
