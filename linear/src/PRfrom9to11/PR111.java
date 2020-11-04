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
        int counter =0;
        int[] r1 =new int[8];
        int[] r = {-5,9,-5,6,7,-3,-4,5,9,7};

        for (int i = 0, n = r.length; i < n; i++) {
            System.out.print(r[i]+", ");
        }
        System.out.println();
        for (int i = 0, n = r.length; i < n; i++){
            if (min > r[i]) {
            min = r[i];
            minI =i ;
        }
        if (max < r[i]) {
            max = r[i];
            maxI = i;}
        }
        for (int i = 0, n = r.length; i < n; i++) {
            if(r[i]==min & i!=minI){f1 = i;}
            if(r[i]==max& i!=maxI){f2 = i;}
        }
        for (int i = 0, n = r1.length; i < n; i++) {
        if(i == f1 ){
        }else if(i==f2){}else{r1[counter]=r[i];counter++;}


        }
        System.out.println(f1+", "+f2);
        System.out.println(minI+", "+maxI);

        for (int i = 0, n = r1.length; i < n; i++) {
            System.out.println(r1[i]);
        }
    }

}
